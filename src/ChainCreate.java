public class ChainCreate implements IRequestHandler {
    private IRequestHandler next = null;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(BRequest request) {
        if (request.getType() != ERequestType.CREATE) {
            next.handleRequest(request);
        }

        Movie movie = SDatabase.getInstance().create(request.getMovie());
        request.setConclusion("Movie added to the database:" + movie.getTitle());
    }
}
