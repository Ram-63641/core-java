class BroccoliStoreRunner {

    public static void main(String[] args) {

        Broccoli b1 = new Broccoli("Organic", "Green", 1.2, 50, true, "India", "A", 10, "10-10-2025", "Round");
        Broccoli b2 = new Broccoli("Hybrid", "Green", 1.0, 45, true, "USA", "B", 12, "11-10-2025", "Oval");
        Broccoli b3 = new Broccoli("Organic", "DarkGreen", 1.5, 60, true, "India", "A", 8, "12-10-2025", "Round");
        Broccoli b4 = new Broccoli("Hybrid", "LightGreen", 1.1, 40, false, "Brazil", "C", 15, "13-10-2025", "Oval");
        Broccoli b5 = new Broccoli("Organic", "Green", 1.3, 55, true, "India", "A", 9, "14-10-2025", "Round");
        Broccoli b6 = new Broccoli("Hybrid", "Green", 1.4, 48, true, "Mexico", "B", 11, "15-10-2025", "Oval");
        Broccoli b7 = new Broccoli("Organic", "DarkGreen", 1.6, 65, true, "Spain", "A", 7, "16-10-2025", "Round");
        Broccoli b8 = new Broccoli("Hybrid", "LightGreen", 1.2, 42, false, "Italy", "C", 13, "17-10-2025", "Oval");
        Broccoli b9 = new Broccoli("Organic", "Green", 1.7, 70, true, "India", "A", 6, "18-10-2025", "Round");
        Broccoli b10 = new Broccoli("Hybrid", "Green", 1.0, 45, true, "USA", "B", 12, "19-10-2025", "Oval");
        Broccoli b11 = new Broccoli("Organic", "DarkGreen", 1.8, 75, true, "India", "A", 5, "20-10-2025", "Round");
        Broccoli b12 = new Broccoli("Hybrid", "LightGreen", 1.3, 50, false, "France", "C", 14, "21-10-2025", "Oval");
        Broccoli b13 = new Broccoli("Organic", "Green", 1.4, 55, true, "India", "A", 10, "22-10-2025", "Round");
        Broccoli b14 = new Broccoli("Hybrid", "Green", 1.1, 48, true, "Germany", "B", 11, "23-10-2025", "Oval");
        Broccoli b15 = new Broccoli("Organic", "DarkGreen", 1.9, 80, true, "India", "A", 4, "24-10-2025", "Round");
        Broccoli b16 = new Broccoli("Hybrid", "LightGreen", 1.2, 46, false, "UK", "C", 13, "25-10-2025", "Oval");
        Broccoli b17 = new Broccoli("Organic", "Green", 1.5, 60, true, "India", "A", 8, "26-10-2025", "Round");
        Broccoli b18 = new Broccoli("Hybrid", "Green", 1.0, 45, true, "USA", "B", 12, "27-10-2025", "Oval");
        Broccoli b19 = new Broccoli("Organic", "DarkGreen", 1.6, 65, true, "India", "A", 7, "28-10-2025", "Round");
        Broccoli b20 = new Broccoli("Hybrid", "LightGreen", 1.3, 50, false, "Canada", "C", 14, "29-10-2025", "Oval");

        BroccoliStore store = new BroccoliStore();

        store.save(b1);  store.save(b2);  store.save(b3);  store.save(b4);  store.save(b5);
        store.save(b6);  store.save(b7);  store.save(b8);  store.save(b9);  store.save(b10);
        store.save(b11); store.save(b12); store.save(b13); store.save(b14); store.save(b15);
        store.save(b16); store.save(b17); store.save(b18); store.save(b19); store.save(b20);

        store.displayAll();
    }
}