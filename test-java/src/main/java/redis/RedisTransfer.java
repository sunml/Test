package redis;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONObject;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

class RedisTransfer {

	static String ip = "192.168.1.101";
	static int port = 6379;
	static int timeOut = 1000;
	static String password = "testpassword";

	static {

	}

	private static JedisPool getConnection() {
		JedisPoolConfig config = initMasterPoolConfig();
		JedisPool masterPool = new JedisPool(config, ip, port, timeOut, password);
		return masterPool;
	}

	public static void main(String[] args) {
		Arrays.hashCode(new int[]{1,2,3});
		String key = "diantou:stock:market";
		getData(key);
		key = "diantou:stock:fenshi";
		Map<String, String> fenshiCache = new Hashtable<>();
		fenshiCache.put("test", "test");
		setData(key, fenshiCache);
	}

	private static void setData(String key, Map<String, String> data) {
		JedisPool masterPool = getConnection();
		Jedis jedisResource = masterPool.getResource();
		String hmset = jedisResource.hmset(key, data);
		System.out.println(hmset);
		jedisResource.disconnect();
		jedisResource.close();
		masterPool.close();
	}

	private static void getData(String key) {
		JedisPool masterPool = getConnection();
		Jedis jedisResource = masterPool.getResource();
		// jedisResource.slaveofNoOne();//主从切换
		// slave.slaveof("192.168.40.133", 6379);//更改从库
		// jedisResource.select(3);//切换库
		Map<String, String> fenshiCache = jedisResource.hgetAll(key);
		Set<Entry<String, String>> entrySet = fenshiCache.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(JSONObject.wrap(entry));
		}
		jedisResource.disconnect();
		jedisResource.close();
		masterPool.close();
	}

	private static JedisPoolConfig initMasterPoolConfig() {
		String minIdle = "3";
		String maxIdle = "10";
		String MaxTotal = "20";
		String MaxWaitMillis = "1000";
		String TestOnCreate = "true";
		String TestOnReturn = "true";
		String TestOnBorrow = "false";
		String TestWhileIdle = "false";
		String Lifo = "true";
		String BlockWhenExhausted = "true";
		String NumTestsPerEvictionRun = "3";
		String TimeBetweenEvictionRunsMillis = "-1";
		String MinEvictableIdleTimeMillis = "1800000";
		String SoftMinEvictableIdleTimeMillis = "1800000";
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMinIdle(Integer.parseInt(minIdle)); // 最小空闲连接数, 默认0
		config.setMaxIdle(Integer.parseInt(maxIdle)); // 最大空闲连接数, 默认8个
		config.setMaxTotal(Integer.parseInt(MaxTotal)); // 最大连接数, 默认8个
		// 获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常,小于零:阻塞不确定的时间,默认-1
		config.setMaxWaitMillis(Long.parseLong(MaxWaitMillis));
		config.setTestOnCreate(Boolean.parseBoolean(TestOnCreate));
		config.setTestOnReturn(Boolean.parseBoolean(TestOnReturn));
		// 在获取连接的时候检查有效性,默认false
		config.setTestOnBorrow(Boolean.parseBoolean(TestOnBorrow));
		// 在空闲时检查有效性,默认false
		config.setTestWhileIdle(Boolean.parseBoolean(TestWhileIdle));
		config.setLifo(Boolean.parseBoolean(Lifo)); // 是否启用后进先出, 默认true
		// 连接耗尽时是否阻塞,false报异常,ture阻塞直到超时,默认true
		config.setBlockWhenExhausted(Boolean.parseBoolean(BlockWhenExhausted));
		// 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
		config.setNumTestsPerEvictionRun(Integer.parseInt(NumTestsPerEvictionRun));
		// 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
		config.setTimeBetweenEvictionRunsMillis(Long.parseLong(TimeBetweenEvictionRunsMillis));
		// 逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
		config.setMinEvictableIdleTimeMillis(Long.parseLong(MinEvictableIdleTimeMillis));
		// 对象空闲多久后逐出, 当空闲时间>该值 且 空闲连接>最大空闲数
		// 时直接逐出,不再根据MinEvictableIdleTimeMillis判断 (默认逐出策略)
		config.setSoftMinEvictableIdleTimeMillis(Long.parseLong(SoftMinEvictableIdleTimeMillis));
		return config;
	}
}
