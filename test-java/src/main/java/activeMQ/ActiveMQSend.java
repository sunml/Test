package activeMQ;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.transport.stomp.Stomp;
import org.apache.activemq.transport.stomp.StompConnection;
import org.json.JSONObject;

public class ActiveMQSend {

	public static void main(String[] args) {
		String queueName = "q1";
		String topicName = "topicName";
		String brokerUriOpenwire = "tcp://192.168.10.152:61616";
		try {
			URI uri = new URI(brokerUriOpenwire);
			System.out.println(uri.toString());
			System.out.println(uri.getHost());
			for (int i = 0; i < 6; i++) {
				sendMessageByOpenwire(brokerUriOpenwire, topicName, queueName, "test" + i);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		// sendMessageByOpenwire(brokerUriOpenwire, queueName, "testActiveMQ");
	}

	public static void sendMessageByOpenwire(final String brokerUri, final String queueName, final String topicName, final String msgBody) {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerUri);
		Connection connection = null;
		Session session = null;
		try {
			// 设置用户名和密码，这个用户名和密码在conf目录下的credentials.properties文件中，也可以在activemq.xml中配置
			// connectionFactory.setUserName("username");
			// connectionFactory.setPassword("password");

			connection = connectionFactory.createConnection();

			// 创建Session，参数解释：
			// 第一个参数是否使用事务:当消息发送者向消息提供者（即消息代理）发送消息时，消息发送者等待消息代理的确认，没有回应则抛出异常，消息发送程序负责处理这个错误。
			// 第二个参数消息的确认模式：
			// AUTO_ACKNOWLEDGE:指定消息提供者在每次收到消息时自动发送确认。消息只向目标发送一次，但传输过程中可能因为错误而丢失消息。
			// CLIENT_ACKNOWLEDGE:由消息接收者确认收到消息，通过调用消息的acknowledge()方法（会通知消息提供者收到了消息）
			// DUPS_OK_ACKNOWLEDGE:指定消息提供者在消息接收者没有确认发送时重新发送消息（这种确认模式不在乎接收者收到重复的消息）
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// 创建目标，可以创建主题(Topic)也可以创建队列(Queue)
			Destination destination = session.createQueue(queueName);

			session.createTopic(topicName);
			// 创建生产者
			MessageProducer producer = session.createProducer(destination);
			// 设置持久化，DeliveryMode.PERSISTENT和DeliveryMode.NON_PERSISTENT
			producer.setDeliveryMode(DeliveryMode.PERSISTENT);

			// 创建消息
			TextMessage message = session.createTextMessage(msgBody);
			message.setStringProperty("myHeadName1", "myHeadValue1");
			message.setStringProperty("myHeadName2", "myHeadValue2");

			producer.send(message); // 发送消息到ActiveMQ
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (session != null)
				try {
					session.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			if (connection != null)
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
		}
	}

	public static void sendMessageBySTOMP(final String brokerUri, final String queueName, final String msgBody) throws Exception {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put(Stomp.Headers.Send.PERSISTENT, "true");

		Map<String, String> map = new HashMap<String, String>();
		map.put("msgBody", msgBody);
		map.put("sendTime", new Date().toString());

		StompConnection conn = new StompConnection();
		conn.open("192.168.10.161", 61613);
		conn.connect("username", "password");

		String tx = UUID.randomUUID().toString().replaceAll("-", "");
		conn.begin(tx);
		conn.send(queueName, new JSONObject(map).toString(), tx, headers);
		conn.commit(tx);

		conn.disconnect();
	}
}
