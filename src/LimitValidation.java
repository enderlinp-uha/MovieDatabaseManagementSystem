public class LimitValidation implements IValidationService {
    IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.limitReached()) {
            request.setConclusion("[Failure] Sorry, limit has been reached");
            next = null;
        } else {
            System.out.println("[Success] Limit has not been reached yet");
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
