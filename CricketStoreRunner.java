class CricketStoreRunner {

    public static void main(String[] args) {

        Cricket c1 = new Cricket("RCB", "Virat", 11, "T20", 20, "Chinnaswamy", true, 180, "India", "Win");
        Cricket c2 = new Cricket("CSK", "Dhoni", 11, "T20", 20, "Chepauk", true, 170, "India", "Win");
        Cricket c3 = new Cricket("MI", "Rohit", 11, "T20", 20, "Wankhede", true, 160, "India", "Lose");
        Cricket c4 = new Cricket("KKR", "Iyer", 11, "T20", 20, "Eden", true, 150, "India", "Win");
        Cricket c5 = new Cricket("SRH", "Kane", 11, "T20", 20, "Hyderabad", true, 140, "India", "Lose");
        Cricket c6 = new Cricket("RR", "Sanju", 11, "T20", 20, "Jaipur", true, 155, "India", "Win");
        Cricket c7 = new Cricket("DC", "Pant", 11, "T20", 20, "Delhi", true, 165, "India", "Lose");
        Cricket c8 = new Cricket("PBKS", "Rahul", 11, "T20", 20, "Punjab", true, 175, "India", "Win");
        Cricket c9 = new Cricket("GT", "Hardik", 11, "T20", 20, "Ahmedabad", true, 185, "India", "Win");
        Cricket c10 = new Cricket("LSG", "KL Rahul", 11, "T20", 20, "Lucknow", true, 150, "India", "Lose");

        Cricket c11 = new Cricket("India", "Rohit", 11, "ODI", 50, "Mumbai", true, 280, "India", "Win");
        Cricket c12 = new Cricket("Australia", "Smith", 11, "ODI", 50, "Sydney", true, 300, "Australia", "Win");
        Cricket c13 = new Cricket("England", "Buttler", 11, "ODI", 50, "London", true, 270, "UK", "Lose");
        Cricket c14 = new Cricket("Pakistan", "Babar", 11, "ODI", 50, "Lahore", true, 260, "Pakistan", "Win");
        Cricket c15 = new Cricket("SouthAfrica", "Markram", 11, "ODI", 50, "CapeTown", true, 250, "SA", "Lose");
        Cricket c16 = new Cricket("NewZealand", "Williamson", 11, "ODI", 50, "Auckland", true, 275, "NZ", "Win");
        Cricket c17 = new Cricket("SriLanka", "Shanaka", 11, "ODI", 50, "Colombo", true, 240, "SL", "Lose");
        Cricket c18 = new Cricket("Bangladesh", "Shakib", 11, "ODI", 50, "Dhaka", true, 245, "BD", "Win");
        Cricket c19 = new Cricket("Afghanistan", "Nabi", 11, "ODI", 50, "Kabul", true, 230, "AFG", "Lose");
        Cricket c20 = new Cricket("WestIndies", "Holder", 11, "ODI", 50, "Barbados", true, 255, "WI", "Win");

        CricketStore cricketStore = new CricketStore();

        cricketStore.save(c1);
        cricketStore.save(c2);
        cricketStore.save(c3);
        cricketStore.save(c4);
        cricketStore.save(c5);
        cricketStore.save(c6);
        cricketStore.save(c7);
        cricketStore.save(c8);
        cricketStore.save(c9);
        cricketStore.save(c10);
        cricketStore.save(c11);
        cricketStore.save(c12);
        cricketStore.save(c13);
        cricketStore.save(c14);
        cricketStore.save(c15);
        cricketStore.save(c16);
        cricketStore.save(c17);
        cricketStore.save(c18);
        cricketStore.save(c19);
        cricketStore.save(c20);

        cricketStore.displayAll();
    }
}