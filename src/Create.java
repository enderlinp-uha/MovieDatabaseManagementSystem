public class Create implements IRequest {
    private IRequest next = null;

    @Override
    public void setNext(IRequest next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == EType.CREATE) {

        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
