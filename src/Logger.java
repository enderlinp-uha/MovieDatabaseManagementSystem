import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    EType type;
    String title;
    String message;
    LocalDateTime timestamp;
    List<Logger> logs = new ArrayList<>();

    public Logger() {}

    public Logger(EType type, String title, String message, LocalDateTime timestamp) {
        this.type = type;
        this.title = title;
        this.message = message;
        this.timestamp = timestamp;
    }

    public void log(EType type, String title, String message) {
        logs.add(new Logger(type, title, message, LocalDateTime.now()));
    }

    public void showLogs() {
        for (Logger log : logs) {
            System.out.println(log);
        }
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + type + " - Film:" + title + " - " + message;
    }
}
