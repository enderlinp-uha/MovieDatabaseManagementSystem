public class FRequest {
    public static BRequest createRequestCreate(Movie movie, User user) {
        return new BRequest.RequestBuilder().setType(ERequestType.CREATE).setMovie(movie).setUser(user).build();
    }

    public static BRequest createRequestUpdate(Movie movie, User user) {
        return new BRequest.RequestBuilder().setType(ERequestType.UPDATE).setMovie(movie).setUser(user).build();
    }

    public static BRequest createRequestDelete(Integer entry, User user) {
        return new BRequest.RequestBuilder().setType(ERequestType.DELETE).setEntry(entry).setUser(user).build();
    }
}
