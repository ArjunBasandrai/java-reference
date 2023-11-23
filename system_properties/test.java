import java.util.Enumeration;
import java.util.Properties;

public class test {
    public static void main(String[] args) {
        Properties prop = System.getProperties();
        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            System.out.println(key + " value is " + 
                prop.getProperty(key));
        }

    }
}
