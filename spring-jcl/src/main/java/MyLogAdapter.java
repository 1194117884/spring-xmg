import org.apache.commons.logging.Log;

public class MyLogAdapter {

    public static Log createLog(String name) {
        return new MyLog(name);
    }

    private static class MyLog implements Log {

        private String name;

        public MyLog(String name) {
            this.name = name;
        }

        public boolean isFatalEnabled() {
            return true;
        }

        public boolean isErrorEnabled() {
            return true;
        }

        public boolean isWarnEnabled() {
            return true;
        }

        public boolean isInfoEnabled() {
            return true;
        }

        public boolean isDebugEnabled() {
            return true;
        }

        public boolean isTraceEnabled() {
            return true;
        }

        public void fatal(Object message) {
            System.out.println("[" + name + "]" + "fatal:" + message.toString());
        }

        public void fatal(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "fatal:" + message.toString() + " " + t.toString());
        }

        public void error(Object message) {
            System.out.println("[" + name + "]" + "error:" + message.toString());
        }

        public void error(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "error:" + message.toString() + " " + t.toString());

        }

        public void warn(Object message) {
            System.out.println("[" + name + "]" + "warn:" + message.toString());

        }

        public void warn(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "warn:" + message.toString() + " " + t.toString());

        }

        public void info(Object message) {
            System.out.println("[" + name + "]" + "info:" + message.toString());

        }

        public void info(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "info:" + message.toString() + " " + t.toString());

        }

        public void debug(Object message) {
            System.out.println("[" + name + "]" + "debug:" + message.toString());

        }

        public void debug(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "debug:" + message.toString() + " " + t.toString());

        }

        public void trace(Object message) {
            System.out.println("[" + name + "]" + "trace:" + message.toString());

        }

        public void trace(Object message, Throwable t) {
            System.out.println("[" + name + "]" + "trace:" + message.toString() + " " + t.toString());

        }
    }

}
