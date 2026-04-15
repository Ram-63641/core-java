class TissueStoreRunner {

    public static void main(String[] args) {

        Tissue t1 = new Tissue("Softy", "White", 2, 100, true, 50.0, "India", "Paper", "Pack1", "12-10-2025");
        Tissue t2 = new Tissue("CleanX", "White", 3, 120, true, 60.0, "USA", "Paper", "Pack2", "13-10-2025");
        Tissue t3 = new Tissue("SoftCare", "Pink", 2, 90, false, 45.0, "India", "Paper", "Pack3", "14-10-2025");
        Tissue t4 = new Tissue("Fresh", "White", 1, 80, true, 40.0, "UK", "Paper", "Pack4", "15-10-2025");
        Tissue t5 = new Tissue("EcoSoft", "Brown", 2, 110, true, 55.0, "India", "Recycled", "Pack5", "16-10-2025");
        Tissue t6 = new Tissue("UltraSoft", "White", 3, 150, true, 70.0, "USA", "Paper", "Pack6", "17-10-2025");
        Tissue t7 = new Tissue("CarePlus", "Blue", 2, 95, false, 48.0, "India", "Paper", "Pack7", "18-10-2025");
        Tissue t8 = new Tissue("MaxClean", "White", 4, 200, true, 90.0, "Germany", "Paper", "Pack8", "19-10-2025");
        Tissue t9 = new Tissue("SoftTouch", "White", 2, 105, true, 52.0, "France", "Paper", "Pack9", "20-10-2025");
        Tissue t10 = new Tissue("DailyUse", "White", 1, 70, false, 35.0, "India", "Paper", "Pack10", "21-10-2025");
        Tissue t11 = new Tissue("EcoClean", "Brown", 3, 130, true, 65.0, "India", "Recycled", "Pack11", "22-10-2025");
        Tissue t12 = new Tissue("PureSoft", "White", 2, 100, true, 50.0, "USA", "Paper", "Pack12", "23-10-2025");
        Tissue t13 = new Tissue("HygieneX", "White", 3, 140, true, 75.0, "UK", "Paper", "Pack13", "24-10-2025");
        Tissue t14 = new Tissue("FreshCare", "Pink", 2, 90, false, 45.0, "India", "Paper", "Pack14", "25-10-2025");
        Tissue t15 = new Tissue("SoftPlus", "White", 4, 180, true, 85.0, "Germany", "Paper", "Pack15", "26-10-2025");
        Tissue t16 = new Tissue("CleanSoft", "White", 2, 110, true, 55.0, "France", "Paper", "Pack16", "27-10-2025");
        Tissue t17 = new Tissue("EcoTouch", "Brown", 3, 125, true, 60.0, "India", "Recycled", "Pack17", "28-10-2025");
        Tissue t18 = new Tissue("UltraClean", "White", 5, 220, true, 95.0, "USA", "Paper", "Pack18", "29-10-2025");
        Tissue t19 = new Tissue("DailySoft", "White", 1, 75, false, 38.0, "India", "Paper", "Pack19", "30-10-2025");
        Tissue t20 = new Tissue("MaxSoft", "White", 3, 140, true, 72.0, "UK", "Paper", "Pack20", "31-10-2025");

        TissueStore tissueStore = new TissueStore();

        tissueStore.save(t1);
        tissueStore.save(t2);
        tissueStore.save(t3);
        tissueStore.save(t4);
        tissueStore.save(t5);
        tissueStore.save(t6);
        tissueStore.save(t7);
        tissueStore.save(t8);
        tissueStore.save(t9);
        tissueStore.save(t10);
        tissueStore.save(t11);
        tissueStore.save(t12);
        tissueStore.save(t13);
        tissueStore.save(t14);
        tissueStore.save(t15);
        tissueStore.save(t16);
        tissueStore.save(t17);
        tissueStore.save(t18);
        tissueStore.save(t19);
        tissueStore.save(t20);

        tissueStore.displayAll();
    }
}