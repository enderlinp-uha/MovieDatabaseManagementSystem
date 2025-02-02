public class SRequestLogger {

    private static RequestLogger instance = null;

    private SRequestLogger() {}

    public static RequestLogger getIntance() {
        if (instance == null) {
            instance = new RequestLogger();
        }
        return instance;
    }
}
