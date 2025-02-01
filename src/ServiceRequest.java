public class ServiceRequest {
    private EType type;
    private BRequest request;
    private String conclusion;

    public ServiceRequest(EType type, BRequest request) {
        this.type = type;
        this.request = request;
    }

    public EType getType() {
        return type;
    }

    public BRequest getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
