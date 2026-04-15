class MovieStoreRunner {

    public static void main(String[] args) {

        Movie m1 = new Movie("KGF", "Prashanth Neel", "Action", 9.0, 180, "Kannada", true, 100, "2018", "Yash");
        Movie m2 = new Movie("RRR", "Rajamouli", "Action", 9.2, 182, "Telugu", true, 300, "2022", "NTR");
        Movie m3 = new Movie("Bahubali", "Rajamouli", "Action", 9.5, 170, "Telugu", true, 250, "2015", "Prabhas");
        Movie m4 = new Movie("Pushpa", "Sukumar", "Action", 8.8, 160, "Telugu", true, 200, "2021", "Allu Arjun");
        Movie m5 = new Movie("Leo", "Lokesh", "Action", 8.5, 165, "Tamil", true, 250, "2023", "Vijay");
        Movie m6 = new Movie("Jailer", "Nelson", "Action", 8.7, 150, "Tamil", true, 200, "2023", "Rajinikanth");
        Movie m7 = new Movie("Salaar", "Prashanth Neel", "Action", 9.1, 175, "Telugu", true, 300, "2023", "Prabhas");
        Movie m8 = new Movie("Dangal", "Nitesh", "Drama", 9.3, 160, "Hindi", true, 70, "2016", "Aamir Khan");
        Movie m9 = new Movie("3 Idiots", "Rajkumar", "Comedy", 9.4, 170, "Hindi", true, 55, "2009", "Aamir Khan");
        Movie m10 = new Movie("Drishyam", "Jeethu", "Thriller", 9.0, 150, "Malayalam", true, 50, "2013", "Mohanlal");
        Movie m11 = new Movie("Kantara", "Rishab", "Action", 9.1, 150, "Kannada", true, 20, "2022", "Rishab");
        Movie m12 = new Movie("Vikram", "Lokesh", "Action", 8.9, 160, "Tamil", true, 150, "2022", "Kamal");
        Movie m13 = new Movie("Master", "Lokesh", "Action", 8.4, 170, "Tamil", true, 200, "2021", "Vijay");
        Movie m14 = new Movie("War", "Siddharth", "Action", 8.2, 155, "Hindi", true, 170, "2019", "Hrithik");
        Movie m15 = new Movie("Pathaan", "Siddharth", "Action", 8.6, 150, "Hindi", true, 250, "2023", "SRK");
        Movie m16 = new Movie("Jawan", "Atlee", "Action", 8.8, 165, "Hindi", true, 300, "2023", "SRK");
        Movie m17 = new Movie("Animal", "Sandeep", "Drama", 8.5, 180, "Hindi", true, 200, "2023", "Ranbir");
        Movie m18 = new Movie("KGF2", "Prashanth Neel", "Action", 9.3, 180, "Kannada", true, 150, "2022", "Yash");
        Movie m19 = new Movie("Eega", "Rajamouli", "Fantasy", 8.7, 140, "Telugu", true, 40, "2012", "Nani");
        Movie m20 = new Movie("Race", "Abbas", "Action", 7.5, 140, "Hindi", false, 60, "2008", "Saif");

        MovieStore store = new MovieStore();

        store.save(m1);  store.save(m2);  store.save(m3);  store.save(m4);  store.save(m5);
        store.save(m6);  store.save(m7);  store.save(m8);  store.save(m9);  store.save(m10);
        store.save(m11); store.save(m12); store.save(m13); store.save(m14); store.save(m15);
        store.save(m16); store.save(m17); store.save(m18); store.save(m19); store.save(m20);

        store.displayAll();
    }
}