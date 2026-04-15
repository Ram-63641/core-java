class SpaceShipStoreRunner {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip("Apollo", "USA", 25000, 3, "Liquid", false, 30000, "Moon", 1969, "Moon");
        SpaceShip s2 = new SpaceShip("Chandrayaan", "India", 24000, 2, "Liquid", false, 20000, "Research", 2019, "Moon");
        SpaceShip s3 = new SpaceShip("Falcon9", "USA", 27000, 7, "Hybrid", true, 50000, "Satellite", 2020, "Orbit");
        SpaceShip s4 = new SpaceShip("Soyuz", "Russia", 23000, 3, "Liquid", false, 28000, "Transport", 2015, "ISS");
        SpaceShip s5 = new SpaceShip("Shenzhou", "China", 24000, 3, "Liquid", false, 29000, "Research", 2018, "Orbit");
        SpaceShip s6 = new SpaceShip("Starship", "USA", 30000, 100, "Methane", true, 100000, "Mars", 2025, "Mars");
        SpaceShip s7 = new SpaceShip("Gaganyaan", "India", 25000, 3, "Liquid", false, 27000, "Human", 2024, "Orbit");
        SpaceShip s8 = new SpaceShip("Vostok", "Russia", 22000, 1, "Liquid", false, 26000, "Historic", 1961, "Orbit");
        SpaceShip s9 = new SpaceShip("Dragon", "USA", 26000, 7, "Hybrid", true, 45000, "Cargo", 2021, "ISS");
        SpaceShip s10 = new SpaceShip("NewShepard", "USA", 28000, 6, "Liquid", true, 35000, "Tourism", 2022, "Suborbit");
        SpaceShip s11 = new SpaceShip("Orion", "USA", 27000, 4, "Liquid", false, 40000, "DeepSpace", 2023, "Moon");
        SpaceShip s12 = new SpaceShip("Tianhe", "China", 24000, 3, "Liquid", false, 30000, "Station", 2021, "Orbit");
        SpaceShip s13 = new SpaceShip("Skylab", "USA", 22000, 3, "Liquid", false, 35000, "Station", 1973, "Orbit");
        SpaceShip s14 = new SpaceShip("Mir", "Russia", 23000, 6, "Liquid", false, 37000, "Station", 1986, "Orbit");
        SpaceShip s15 = new SpaceShip("Voyager", "USA", 17000, 0, "Nuclear", false, 15000, "Exploration", 1977, "Space");
        SpaceShip s16 = new SpaceShip("Pioneer", "USA", 16000, 0, "Nuclear", false, 14000, "Exploration", 1972, "Space");
        SpaceShip s17 = new SpaceShip("Hubble", "USA", 20000, 0, "Solar", false, 12000, "Telescope", 1990, "Orbit");
        SpaceShip s18 = new SpaceShip("JamesWebb", "USA", 21000, 0, "Solar", false, 13000, "Telescope", 2021, "DeepSpace");
        SpaceShip s19 = new SpaceShip("INSAT", "India", 23000, 0, "Solar", false, 11000, "Communication", 2003, "Orbit");
        SpaceShip s20 = new SpaceShip("Aryabhata", "India", 22000, 0, "Solar", false, 10000, "Research", 1975, "Orbit");

        SpaceShipStore store = new SpaceShipStore();

        store.save(s1);
        store.save(s2);
        store.save(s3);
        store.save(s4);
        store.save(s5);
        store.save(s6);
        store.save(s7);
        store.save(s8);
        store.save(s9);
        store.save(s10);
        store.save(s11);
        store.save(s12);
        store.save(s13);
        store.save(s14);
        store.save(s15);
        store.save(s16);
        store.save(s17);
        store.save(s18);
        store.save(s19);
        store.save(s20);

        store.displayAll();
    }
}