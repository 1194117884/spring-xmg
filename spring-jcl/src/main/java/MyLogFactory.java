import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyLogFactory extends LogFactory {


    public static Log getLog(Class<?> clazz) {
        return getLog(clazz.getName());
    }


    public static Log getLog(String name) {
        return MyLogAdapter.createLog(name);
    }

}
