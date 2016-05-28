package activeMQ;

import java.util.HashMap;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.transport.stomp.Stomp.Headers.Subscribe;
import org.apache.activemq.transport.stomp.StompConnection;
import org.apache.activemq.transport.stomp.StompFrame;

public class ActiveMQReceive {

	public static void main(String[] args) throws Exception {
		String queueName = "q1";
		String brokerUriOpenwire = "tcp://192.168.10.152:61616";
		for (int i = 0; i < 5; i++) {
			readMessageByOpenwire(brokerUriOpenwire, queueName);
		}
	}

	public static void readMessageByOpenwire(final String brokerUri, final String queueName) throws Exception {
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;
		try {
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerUri);
			// 设置用户名和密码，这个用户名和密码在conf目录下的credentials.properties文件中，也可以在activemq.xml中配置
			// connectionFactory.setUserName("username");
			// connectionFactory.setPassword("password");

			// 创建连接
			connection = connectionFactory.createConnection();
			connection.start();
			// 创建Session
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			// 创建目标，可以创建主题(Topic)也可以创建队列(Queue)
			Destination destination = session.createQueue(queueName);
			// 创建消息消费者
			consumer = session.createConsumer(destination);
			// 接收消息，参数：接收消息的超时时间，为0的话则不超时，receive返回下一个消息，但是超时了或者消费者被关闭，返回null
			Message message = consumer.receive(1000);
			if (message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage) message;
				String text = textMessage.getText();
				System.out.println("Received: " + text);
			} else {
				System.out.println("Received: " + message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (consumer != null)
				consumer.close();
			if (session != null)
				session.close();
			if (connection != null)
				connection.close();
		}
	}

	public static void readMessageBySTOMP(final String brokerUri, final String queueName) throws Exception {
		HashMap<String, String> headers = new HashMap<String, String>();
		StompConnection conn = new StompConnection();
		conn.open("192.168.10.161", 61613);
		conn.connect("username", "password");
		conn.subscribe(queueName, Subscribe.AckModeValues.AUTO, headers);
		while (true) {
			try {
				StompFrame msg = conn.receive(60000);
				System.out.println("received message: " + msg.getBody());
				Thread.sleep(50); // 暂停 0.05 秒
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		conn.unsubscribe(queueName);
		conn.disconnect();
	}

}