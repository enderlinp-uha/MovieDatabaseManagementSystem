public interface IRequestHandler {
    public void setNext(IRequestHandler next);
    public void handleRequest(RequestHandler requestHandler, BRequest request);
}
