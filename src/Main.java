public class Main {
    public static void main(String[] args) {
        /*
        Exercice : Système de gestion des requêtes utilisateur
        Vous devez implémenter un système qui gère les requêtes des utilisateurs via une chaîne de responsabilité. Le système repose sur une Factory pour créer les requêtes, un Builder pour les construire, et un Singleton pour gérer un journal des requêtes traitées.
        Les requêtes concernent la gestion d’une BDD de film à la Netflix.

         Contraintes
        Builder Pattern : Construire un objet Request avec divers paramètres (id, type, contenu).
        Factory Pattern : Une RequestFactory pour créer des requêtes en fonction du type demandé.
        Singleton Pattern : Un RequestLogger qui stocke les requêtes traitées.
        Chain of Responsibility : Une chaîne de gestionnaires (Handler) qui traitent la requête si possible, ou la passent au suivant.
        Gérer l’auth
        Ne pas dépasser 10 films
        CUD

        Main : liste des films : ID, Nom, catégorie, durée (string)
        1) Class Film / FFilm
        2) Class Log / SLog
        3) Class User : Id, nom, auth, role [Enum ERole { ADMIN, USERuser }]
        4) Class BRequest : ID, typeModif, timestamp, commentaire, auteur, filmID [Enum Etype { CREATE, UPDATE, DELETE }]
        5) Class CoR : Auth, Role, Limit, Exist, C, U, D
        */

        User admin = new User(1, "John DOE", true, ERole.ADMIN);
        User user1 = new User(2, "Jane DOE", false, ERole.USER);
        User user2 = new User(3, "Bob DOE", true, ERole.USER);

        System.out.println(admin);
        System.out.println(user1);
        System.out.println(user2);

        Film film = FFilm.create(1, "2001, L'Odysée de l'espace", "Science-fiction", "02:30:00");

    }
}