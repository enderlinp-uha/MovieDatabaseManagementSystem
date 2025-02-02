import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {
    private List<String> logs = new ArrayList<>();

    public Logger() {
        this.log(ELogType.INFO, "Logger initialized");
    }

    private String prepend(ELogType type, String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(" - ");
        sb.append(Utils.formattedDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
        sb.append(" --> ");
        sb.append(message);

        return sb.toString();
    }

    public void log(ELogType type, String message) {
        String entry = this.prepend(type, message);
        this.logs.add(entry);
        System.out.println(entry);
    }
}
