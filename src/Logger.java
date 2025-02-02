import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private ERequestType type;
    private String title;
    private String message;
    private List<Logger> logs = new ArrayList<>();

    public Logger() {}

    public Logger(ERequestType type, String title, String message) {
        this.type = type;
        this.title = title;
        this.message = message;
    }

    public void log(RequestHandler request, String message) {
        Logger entry = new Logger(request.getType(), request.getMovie().getTitle(), message);
        logs.add(entry);
        System.out.println(entry);
    }

    @Override
    public String toString() {
        return "[" + LocalDateTime.now() + "] " + this.type + " - Film: " + this.title + " - " + this.message;
    }
}
