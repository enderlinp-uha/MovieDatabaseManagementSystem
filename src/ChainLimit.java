public class ChainLimit implements IRequestHandler {
    private IRequestHandler next = null;
    private final int LIMIT = 10;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(BRequest request) {
        if (request.getType() != ERequestType.CREATE) {
            next.handleRequest(request);
        }

        if (SDatabase.getInstance().getCount() > LIMIT) {
            request.setConclusion("Database exceeded limit of " + LIMIT);
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
