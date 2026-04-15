class GloveStoreRunner {

    public static void main(String[] args) {

        Glove g1 = new Glove("Nike", "Leather", "M", "Black", 1200, true, "Sports", "Cricket", "USA", 12);
        Glove g2 = new Glove("Adidas", "Cotton", "L", "White", 900, false, "Casual", "Daily", "Germany", 6);
        Glove g3 = new Glove("Puma", "Leather", "S", "Red", 1100, true, "Sports", "Gym", "Germany", 12);
        Glove g4 = new Glove("Reebok", "Rubber", "M", "Blue", 800, true, "Safety", "Work", "USA", 8);
        Glove g5 = new Glove("HRX", "Cotton", "L", "Black", 700, false, "Casual", "Daily", "India", 6);
        Glove g6 = new Glove("SG", "Leather", "M", "White", 1500, true, "Sports", "Cricket", "India", 12);
        Glove g7 = new Glove("Kookaburra", "Leather", "L", "White", 1800, true, "Sports", "Cricket", "Australia", 12);
        Glove g8 = new Glove("Yonex", "Synthetic", "S", "Blue", 950, false, "Sports", "Badminton", "Japan", 6);
        Glove g9 = new Glove("Wilson", "Leather", "M", "Brown", 1400, true, "Sports", "Baseball", "USA", 12);
        Glove g10 = new Glove("Bauer", "Rubber", "L", "Black", 1300, true, "Safety", "Work", "Canada", 10);
        Glove g11 = new Glove("Decathlon", "Cotton", "M", "Gray", 600, false, "Casual", "Daily", "France", 6);
        Glove g12 = new Glove("UnderArmour", "Leather", "S", "Black", 1600, true, "Sports", "Gym", "USA", 12);
        Glove g13 = new Glove("Asics", "Synthetic", "M", "Blue", 1000, false, "Sports", "Running", "Japan", 8);
        Glove g14 = new Glove("Fila", "Cotton", "L", "White", 850, false, "Casual", "Daily", "Italy", 6);
        Glove g15 = new Glove("NewBalance", "Leather", "M", "Black", 1400, true, "Sports", "Gym", "USA", 12);
        Glove g16 = new Glove("Columbia", "Wool", "L", "Brown", 1700, true, "Winter", "Cold", "USA", 10);
        Glove g17 = new Glove("NorthFace", "Wool", "M", "Black", 2000, true, "Winter", "Snow", "USA", 12);
        Glove g18 = new Glove("Timberland", "Leather", "S", "Brown", 1800, true, "Safety", "Work", "USA", 12);
        Glove g19 = new Glove("Wildcraft", "Synthetic", "M", "Green", 900, true, "Outdoor", "Travel", "India", 8);
        Glove g20 = new Glove("Quechua", "Synthetic", "L", "Blue", 950, true, "Outdoor", "Hiking", "France", 8);

        GloveStore store = new GloveStore();

        store.save(g1);  store.save(g2);  store.save(g3);  store.save(g4);  store.save(g5);
        store.save(g6);  store.save(g7);  store.save(g8);  store.save(g9);  store.save(g10);
        store.save(g11); store.save(g12); store.save(g13); store.save(g14); store.save(g15);
        store.save(g16); store.save(g17); store.save(g18); store.save(g19); store.save(g20);

        store.displayAll();
    }
}