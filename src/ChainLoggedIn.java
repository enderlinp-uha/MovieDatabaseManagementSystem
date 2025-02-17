public class ChainLoggedIn implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(BRequest request) {
        if (request.getType() != ERequestType.CREATE &&
                request.getType() != ERequestType.UPDATE &&
                request.getType() != ERequestType.DELETE) {
            next.handleRequest(request);
        }

        if (!request.getUser().isLoggedIn()) {
            request.setConclusion("User is not logged in");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
