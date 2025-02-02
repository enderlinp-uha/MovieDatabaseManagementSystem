public class ChainRole implements IRequestHandler {
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

        if (!request.getUser().isAdmin()) {
            request.setConclusion("User is not admin");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
