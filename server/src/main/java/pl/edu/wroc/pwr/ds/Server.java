package pl.edu.wroc.pwr.ds;
import org.apache.xmlrpc.common.TypeConverterFactoryImpl;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;
import org.apache.log4j.Logger;
/**
 * Hello world server!
 *
 */
public class Server{
  final static Logger logger = Logger.getLogger(Server.class);
	private static final int port = 8080;

    // Throws in here is really ugly :(
    public static void main( String[] args ) throws Exception{
      // Using SOUT is realy ugly :(
      logger.info("Preparing server");
      WebServer webServer = new WebServer(port);

      XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();

      PropertyHandlerMapping phm = new PropertyHandlerMapping();
      phm.setVoidMethodEnabled(true);
      /* Load handler definitions from a property file.
       * The property file might look like:
       *   Calculator=org.apache.xmlrpc.demo.Calculator
       *   org.apache.xmlrpc.demo.proxy.Adder=org.apache.xmlrpc.demo.proxy.AdderImpl
       */
      phm.load(Thread.currentThread().getContextClassLoader(), "MyHandlers.properties");
      /* You may also provide the handler classes directly,
       * like this:
       * phm.addHandler("Calculator",
       *     org.apache.xmlrpc.demo.Calculator.class);
       * phm.addHandler(org.apache.xmlrpc.demo.proxy.Adder.class.getName(),
       *     org.apache.xmlrpc.demo.proxy.AdderImpl.class);
       */
      phm.addHandler("Hello2", Hello.class);
      xmlRpcServer.setHandlerMapping(phm);
      
      XmlRpcServerConfigImpl serverConfig =  (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
      serverConfig.setEnabledForExtensions(true);
      serverConfig.setContentLengthOptional(false);
      // Using SOUT is realy ugly :(
      logger.info("Starting server");
      webServer.start();
    }
}
