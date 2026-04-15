class LaserStoreRunner {

    public static void main(String[] args) {

        Laser l1 = new Laser("Bosch", "Industrial", 10.5, "Red", 650, true, 5000, "Cutting", "Germany", 2);
        Laser l2 = new Laser("Philips", "Medical", 8.0, "Green", 532, false, 7000, "Surgery", "Netherlands", 3);
        Laser l3 = new Laser("Sony", "Consumer", 5.5, "Blue", 450, true, 3000, "Presentation", "Japan", 1);
        Laser l4 = new Laser("LG", "Industrial", 9.2, "Red", 650, false, 5500, "Engraving", "Korea", 2);
        Laser l5 = new Laser("Samsung", "Consumer", 6.8, "Green", 532, true, 3500, "Display", "Korea", 2);
        Laser l6 = new Laser("Panasonic", "Medical", 7.5, "Blue", 450, false, 6000, "Therapy", "Japan", 3);
        Laser l7 = new Laser("Hitachi", "Industrial", 11.0, "Red", 650, true, 8000, "Cutting", "Japan", 2);
        Laser l8 = new Laser("Sharp", "Consumer", 4.5, "Green", 532, true, 2500, "Pointer", "Japan", 1);
        Laser l9 = new Laser("Toshiba", "Industrial", 10.2, "Blue", 450, false, 7500, "Drilling", "Japan", 3);
        Laser l10 = new Laser("Dell", "Consumer", 5.0, "Red", 650, true, 2000, "Presentation", "USA", 1);

        Laser l11 = new Laser("HP", "Consumer", 6.0, "Green", 532, true, 2800, "Office", "USA", 2);
        Laser l12 = new Laser("Asus", "Industrial", 9.5, "Blue", 450, false, 6200, "Engraving", "Taiwan", 3);
        Laser l13 = new Laser("Acer", "Consumer", 4.8, "Red", 650, true, 2200, "Pointer", "Taiwan", 1);
        Laser l14 = new Laser("Lenovo", "Industrial", 10.8, "Green", 532, false, 7800, "Cutting", "China", 3);
        Laser l15 = new Laser("Canon", "Medical", 7.2, "Blue", 450, false, 6700, "Surgery", "Japan", 2);
        Laser l16 = new Laser("Nikon", "Medical", 8.5, "Red", 650, false, 7100, "Therapy", "Japan", 3);
        Laser l17 = new Laser("Zebra", "Industrial", 9.9, "Green", 532, true, 6400, "Marking", "USA", 2);
        Laser l18 = new Laser("Epson", "Consumer", 5.7, "Blue", 450, true, 3100, "Display", "Japan", 1);
        Laser l19 = new Laser("Brother", "Industrial", 10.1, "Red", 650, false, 7600, "Cutting", "Japan", 3);
        Laser l20 = new Laser("Fujitsu", "Consumer", 6.3, "Green", 532, true, 3300, "Office", "Japan", 2);

        LaserStore laserStore = new LaserStore();

        laserStore.save(l1);
        laserStore.save(l2);
        laserStore.save(l3);
        laserStore.save(l4);
        laserStore.save(l5);
        laserStore.save(l6);
        laserStore.save(l7);
        laserStore.save(l8);
        laserStore.save(l9);
        laserStore.save(l10);
        laserStore.save(l11);
        laserStore.save(l12);
        laserStore.save(l13);
        laserStore.save(l14);
        laserStore.save(l15);
        laserStore.save(l16);
        laserStore.save(l17);
        laserStore.save(l18);
        laserStore.save(l19);
        laserStore.save(l20);

        laserStore.displayAll();
    }
}