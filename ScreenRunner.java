class ScreenRunner {
    public static void main(String[] args) {

        ScreenStore store = new ScreenStore();

        Screen s1 = new Screen("Samsung", 55, "LED", 45000, "4K", true, 120, "Black", "2 years", "India");
        Screen s2 = new Screen("LG", 65, "OLED", 75000, "8K", true, 144, "Silver", "3 years", "Korea");
        Screen s3 = new Screen("Sony", 50, "LED", 40000, "Full HD", false, 60, "Black", "1 year", "Japan");
        Screen s4 = new Screen("Panasonic", 43, "LCD", 30000, "HD", false, 60, "Gray", "1 year", "Japan");
        Screen s5 = new Screen("TCL", 55, "QLED", 42000, "4K", true, 120, "Black", "2 years", "China");
        Screen s6 = new Screen("OnePlus", 65, "LED", 60000, "4K", true, 120, "Black", "3 years", "India");
        Screen s7 = new Screen("Mi", 50, "LED", 35000, "4K", true, 60, "Black", "1 year", "India");
        Screen s8 = new Screen("Realme", 43, "LED", 28000, "Full HD", true, 60, "Black", "1 year", "India");
        Screen s9 = new Screen("Philips", 55, "OLED", 70000, "4K", true, 120, "Silver", "2 years", "Netherlands");
        Screen s10 = new Screen("Sharp", 60, "LED", 50000, "4K", true, 120, "Black", "2 years", "Japan");
        Screen s11 = new Screen("Samsung", 75, "QLED", 90000, "8K", true, 144, "Black", "3 years", "India");
        Screen s12 = new Screen("LG", 48, "OLED", 65000, "4K", true, 120, "Gray", "2 years", "Korea");
        Screen s13 = new Screen("Sony", 55, "LED", 48000, "4K", true, 120, "Black", "2 years", "Japan");
        Screen s14 = new Screen("Panasonic", 40, "LCD", 25000, "HD", false, 60, "White", "1 year", "Japan");
        Screen s15 = new Screen("TCL", 65, "QLED", 55000, "4K", true, 120, "Black", "2 years", "China");
        Screen s16 = new Screen("OnePlus", 50, "LED", 42000, "4K", true, 60, "Black", "2 years", "India");
        Screen s17 = new Screen("Mi", 55, "LED", 38000, "4K", true, 60, "Black", "1 year", "India");
        Screen s18 = new Screen("Realme", 32, "LED", 20000, "HD", false, 60, "Black", "1 year", "India");
        Screen s19 = new Screen("Philips", 65, "OLED", 72000, "4K", true, 120, "Silver", "2 years", "Netherlands");
        Screen s20 = new Screen("Sharp", 70, "LED", 80000, "8K", true, 144, "Black", "3 years", "Japan");

        
        store.save(s1);  store.save(s2);  store.save(s3);  store.save(s4);  store.save(s5);
        store.save(s6);  store.save(s7);  store.save(s8);  store.save(s9);  store.save(s10);
        store.save(s11); store.save(s12); store.save(s13); store.save(s14); store.save(s15);
        store.save(s16); store.save(s17); store.save(s18); store.save(s19); store.save(s20);

        
        store.displayAll();
    }
}