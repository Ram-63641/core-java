class MovieStore {

    Movie[] movies = new Movie[20];
    int index = 0;

    void save(Movie movie) {

        if (movie != null) {

            if (index < movies.length) {
                movies[index] = movie;
                System.out.println("Saved at index: " + index);
                index++;
            } 
		} 
		else {
            System.out.println("Movie is null");
        }
    }

    void displayAll() {

        for (Movie m : movies) {
            if (m != null) {
                m.display();
            }
        }
    }
}