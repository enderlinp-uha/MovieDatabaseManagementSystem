public class RequestHandler {
    private IRequestHandler requestHandler;
    private BRequest request;
    private String conclusion;

    public void handleRequest(IRequestHandler requestHandler, BRequest request) {
        this.requestHandler = requestHandler;
        this.request = request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
