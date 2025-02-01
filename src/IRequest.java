public interface IRequest {
    public void handleRequest(ServiceRequest request);
    public void setNext(IRequest next);
}
