public interface IValidationService {
    public void setNext(IValidationService next);
    public void handleRequest(ValidationRequest request);
}
