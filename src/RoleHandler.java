public class RoleHandler implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler requestHandler, BRequest request) {
        if (!request.getUser().isAdmin()) {
            requestHandler.setConclusion("[Failure] Sorry, you are not an admin");
            next = null;
        } else {
            System.out.println("[Success] Your role is admin");
            if (next != null) {
                next.handleRequest(requestHandler, request);
            }
        }
    }
}
