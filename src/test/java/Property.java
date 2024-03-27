import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	    public static void main(String[]args) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
	    Properties p = new Properties();
	    p.load(fis);
	    String url = p.getProperty("url");
	    String username = p.getProperty("username");
	    String password = p.getProperty("password");
	    System.out.println(url);
	    System.out.println(username);
	    System.out.println(password);
		
	}
}
