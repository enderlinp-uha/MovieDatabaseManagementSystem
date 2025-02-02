public class ChainLoggedIn implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(BRequest request) {
        /*if (!request.getUser().isLoggedIn()) {
            request.setConclusion("[Failure] " + request.getUser().getName() + "is not logged in");
        } else {
            System.out.println("[Success] " + request.getUser().getName() + " has successfully logged in");
            if (next != null) {
                next.handleRequest(request);
            }
        }*/
    }
}
