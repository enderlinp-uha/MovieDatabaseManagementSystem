import java.util.ArrayList;
import java.util.List;

public class LimitHandler implements IRequestHandler {
    private IRequestHandler next = null;
    private final int MAX_LENGTH = 10;
    private List<Movie> movies = new ArrayList<>();

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler requestHandler) {
        if (movies.size() > MAX_LENGTH) {
            requestHandler.setConclusion("[Failure] Sorry, limit has been reached");
            next = null;
        } else {
            System.out.println("[Success] Limit has not been reached yet");
            if (next != null) {
                next.handleRequest(requestHandler);
            }
        }
    }
}
