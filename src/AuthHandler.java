public class AuthHandler implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler requestHandler) {
        if (!requestHandler.getUser().isAuth()) {
            requestHandler.setConclusion("[Failure] Sorry, you are not logged in");
            next = null;
        } else {
            System.out.println("[Success] You have successfully logged in");
            if (next != null) {
                next.handleRequest(requestHandler);
            }
        }
    }
}
