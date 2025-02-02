import java.util.List;

public class ValidationRequest {
    private BRequest.Builder builder;
    private String conclusion;
    private final int LIMIT = 10;

    public ValidationRequest(BRequest.Builder builder) {
        this.builder = builder;
    }

    public User getAuthor() {
        return this.builder.getAuthor();
    }

    public boolean limitReached() {
        return false; //movies.size() >= LIMIT;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
