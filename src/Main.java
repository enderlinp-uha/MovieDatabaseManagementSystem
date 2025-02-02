import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IValidationService auth  = new AuthValidation();
        IValidationService role  = new RoleValidation();
        IValidationService limit = new LimitValidation();

        auth.setNext(role);
        role.setNext(limit);

        User user = new User(1, "John DOE", true, ERole.ADMIN);
        System.out.println(user);

        Map<Integer, Movie> movies = new HashMap<>();
        Movie a = FMovie.create(1, "2001, L'Odysée de l'espace", "Science-fiction", "02:21");
        Movie b = FMovie.create(2, "Interstellar", "Science-fiction", "02:49");
        Movie c = FMovie.create(3, "Knight of Cups", "Drame", "01:58");

        movies.put(1, a);
        movies.put(2, b);
        movies.put(3, c);
        System.out.println(movies);

        BRequest.Builder builder = new BRequest.Builder();
        builder
                .setId(1)
                .setAuthor(user)
                .setType(EType.CREATE)
                .setMessage("Creation request initialized")
                .setMovie(a)
                .build();

        ValidationRequest request = new ValidationRequest(builder);
        auth.handleRequest(request);

        System.out.println(request.getConclusion());
    }
}