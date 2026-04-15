class Movie {

    String name;
    String director;
    String genre;
    double rating;
    int duration;
    String language;
    boolean isHit;
    double budget;
    String releaseDate;
    String hero;

    Movie(String name, String director, String genre, double rating,
          int duration, String language, boolean isHit,
          double budget, String releaseDate, String hero) {

        this.name = name;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.language = language;
        this.isHit = isHit;
        this.budget = budget;
        this.releaseDate = releaseDate;
        this.hero = hero;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration);
        System.out.println("Language: " + language);
        System.out.println("Hit: " + isHit);
        System.out.println("Budget: " + budget);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Hero: " + hero);
        
    }
}