import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SpringJclMain {


    public static void main(String[] args) {
        Log log = LogFactory.getLog(SpringJclMain.class);
        log.debug("test debug info");
        log.info("test info info");
        log.warn("test warn");
        log.error("test error info", new NullPointerException("空指针了"));


        Log myLog = MyLogFactory.getLog(SpringJclMain.class);
        myLog.debug("test debug info");
        myLog.info("test info info");
        myLog.warn("test warn");
        myLog.error("test error info", new NullPointerException("空指针了"));
    }

}