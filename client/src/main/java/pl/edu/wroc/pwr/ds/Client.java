package pl.edu.wroc.pwr.ds;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.net.URL;
import org.apache.log4j.Logger;
/**
 * Hello world client!
 *
 */
public class Client{

  	final static Logger logger = Logger.getLogger(Client.class);

	// Throws in here is really ugly :(
    public static void main( String[] args ) throws Exception{
      	// Using SOUT is realy ugly :(
      	logger.info("Preparing client");
	    XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	    config.setServerURL(new URL("http://127.0.0.1:8080"));
	    config.setEnabledForExtensions(true);
	    XmlRpcClient client = new XmlRpcClient();
	    client.setConfig(config);
	    Object[] params = new Object[]{"Test Client"};
      	// Using SOUT is realy ugly :(
      	logger.info("Calling hello");
	    client.execute("Hello2.hello", params);
    }
    
}
