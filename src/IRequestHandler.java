public interface IRequestHandler {
    public void setNext(IRequestHandler next);
    public void handleRequest(BRequest request);
}