public class RoleValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (!request.getAuthor().isAdmin()) {
            request.setConclusion("You are not an admin!");
            next = null;
        } else {
            request.setConclusion("You are now an admin");
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
