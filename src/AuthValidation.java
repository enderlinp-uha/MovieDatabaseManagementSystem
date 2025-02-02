public class AuthValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (!request.getAuthor().isAuth()) {
            request.setConclusion("[Failure] Sorry, you are not logged in");
            next = null;
        } else {
            System.out.println("[Success] You have successfully logged in");
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
