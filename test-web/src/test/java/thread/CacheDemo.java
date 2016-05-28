package thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class CacheDemo {
	private Map<String, Object> map = new HashMap<String, Object>();// 缓存器
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private static Long millis = 1000L;

	public static void main(String[] args) {
		CacheDemo cacheDemo = new CacheDemo();
		new Thread("getData") {
			public void run() {
				do {
					System.out.println("testKey:" + cacheDemo.getData("testKey"));
					try {
						Thread.sleep(millis);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (true);
			}
		}.start();
	}

	public Object getData(String id) {
		Object value = null;
		ReadLock readLock = rwl.readLock();
		WriteLock writeLock = rwl.writeLock();
		readLock.lock();// 首先开启读锁，从缓存中去取
		try {
			value = map.get(id);
			if (value == null) { // 如果缓存中没有释放读锁，上写锁
				readLock.unlock();
				writeLock.lock();
				try {
					if (value == null) {
						value = "testData"; // 此时可以去数据库中查找，这里简单的模拟一下
					}
				} finally {
					if (writeLock.isHeldByCurrentThread()) {
						int num = writeLock.getHoldCount();
						for (int i = 0; i < num; i++) {
							writeLock.unlock(); // 释放写锁
						}
					}
				}
				readLock.lock(); // 然后再上读锁
			}
		} finally {
			readLock.unlock();// 最后释放读锁
		}
		return value;
	}
}