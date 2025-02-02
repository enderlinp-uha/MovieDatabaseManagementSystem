public class AuthHandler implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler requestHandler, BRequest request) {
        if (!request.getUser().isAuth()) {
            requestHandler.setConclusion("[Failure] Sorry, you are not logged in");
            next = null;
        } else {
            System.out.println("[Success] You have successfully logged in");
            if (next != null) {
                next.handleRequest(requestHandler, request);
            }
        }
    }
}
