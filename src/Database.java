import java.util.HashMap;

public class Database {
    private HashMap<Integer, Movie> movies = new HashMap<>();

    public Database() {
        SLogger.getIntance().log(ELogType.INFO, "Database initialized");
    }
}
