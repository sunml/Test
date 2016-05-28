package runtime;

import java.net.InetAddress;
import java.util.Properties;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.core.io.ClassPathResource;


/**
 * 
 * -Xms512m -Xmx1024m -XX:PermSize=128M -XX:MaxPermSize=256M -Xverify:none -server -XX:+UseSerialGC
 *  -Dcom.sun.management.jmxremote=true
 * 
 * @see <url>http://docs.codehaus.org/display/JETTY/Embedding+Jetty</url>
 * @see $ JETTY_HOME}\examples\embedded\src\main\java\org\mortbay\jetty\example\
 *      OneWebApp.java
 * 
 *      Using embedded mode for OneWebApp
 * 
 *      <p>
 *      dependencies: jasper-compiler-5.5.15.jar jasper-compiler-jdt-5.5.15.jar
 *      jasper-runtime-5.5.15.jar
 * 
 *      jetty-6.1.7.jar jetty-util-6.1.7.jar
 * 
 *      jsp-api-2.0.jar servlet-api-2.5-6.1.7.jar
 * 
 *      slf4j-api-1.3.1.jar slf4j-simple-1.3.1.jar
 * 
 *      xercesImpl-2.6.2.jar xmlParserAPIs-2.6.2.jar
 */
public class NetmanagerJettyStarter {

	public static void main(String[] args) throws Exception {
		ClassPathResource classPathResource = new ClassPathResource("jetty.properties");
		Properties properties = new Properties();
		properties.load(classPathResource.getInputStream());
		int port = Integer.parseInt(properties.getProperty("http.port"));
		String contextPath = properties.getProperty("http.context.path");
		String warApp = properties.getProperty("war.app");
		long begin = System.currentTimeMillis();
		
		Server server = new Server(port);
		WebAppContext webAppContext = new WebAppContext(warApp, contextPath);
		//webAppContext.setDefaultsDescriptor("./src/test/resources/jetty.webdefault.xml");
		webAppContext.setExtraClasspath("./target/classes");
		server.setHandler(webAppContext);
		String host = InetAddress.getLocalHost().getHostAddress();
		try {
			server.start();
			String url = "http://" + host + ":" + port + contextPath;
			System.out.println("[Jetty Server started in " + (System.currentTimeMillis() - begin)/1000 + "s]: " + url);
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(100);
		}
	}
}
