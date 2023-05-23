public class MoviePlatformExample {
    public static void main(String[] args) {
        MoviePlatform moviePlatform = new MoviePlatform();

        User user1 = new User("User1");
        user1.setGenres(List.of("action", "sci-fi"));
        moviePlatform.attach(user1);

        User user2 = new User("User2");
        user2.setGenres(List.of("comedy", "horror"));
        moviePlatform.attach(user2);

        User user3 = new User("User3");
        user3.setGenres(List.of("horror", "anime"));
        moviePlatform.attach(user3);

        User user4 = new User("User4");
        user4.setGenres(List.of("comedy"));
        moviePlatform.attach(user4);

        User user5 = new User("User5");
        user5.setGenres(List.of("sci-fi"));
        moviePlatform.attach(user5);

        // Nova série adicionada na plataforma
        Movie newSeries = new Movie("Stranger Things", "sci-fi");
        moviePlatform.notifyObservers(newSeries);
    }
}
