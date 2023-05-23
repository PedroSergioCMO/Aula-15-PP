interface Observer {
    void update(Movie movie);
}

class User implements Observer {
    private String name;
    private List<String> genres;

    public User(String name) {
        this.name = name;
        genres = new ArrayList<>();
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public void update(Movie movie) {
        if (genres.contains(movie.getGenre())) {
            System.out.println(name + " received a notification for the movie '" + movie.getTitle() + "'!");
        }
    }
}