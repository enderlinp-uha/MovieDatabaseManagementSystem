public class Main {
    public static void main(String[] args) {

        User users = new User();
        users.create(1, "John DOE", true, ERole.ADMIN);
        users.create(2, "Jane DOE", false, ERole.ADMIN);
        users.create(3, "SpongeBob", true, ERole.USER);
        users.show();

        Movie movies = FMovie.create(1, "2001, L'Odysée de l'espace", "Science-fiction", "02:21");
        System.out.println(movies);
    }
}