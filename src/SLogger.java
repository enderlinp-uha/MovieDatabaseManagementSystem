public class SLogger {
    private static Logger instance = null;

    public SLogger() {}

    public static Logger getIntance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
