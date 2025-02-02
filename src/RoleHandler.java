public class RoleHandler implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(RequestHandler request) {
        if (!request.getUser().isAdmin()) {
            request.setConclusion("[Failure] " + request.getUser().getName() + " is not an administrator");
        } else {
            System.out.println("[Success] " + request.getUser().getName() + " is an administrator");
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
