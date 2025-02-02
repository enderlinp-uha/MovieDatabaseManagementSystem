import java.util.HashMap;

public class RequestHandler {
    private BRequest request;
    private RequestHandler requestHandler;
    private String conclusion;

    public RequestHandler(BRequest request) {
        this.request = request;
    }

    public ERequestType getType() {
        return this.request.getType();
    }

    public User getUser() {
        return this.request.getUser();
    }

    public Movie getMovie() {
        return this.request.getMovie();
    }

    public void handleRequest(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
