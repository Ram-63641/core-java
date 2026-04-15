class WaterMelonStoreRunner{
	
	public static void main(String[] args){
		
WaterMelon waterMelon1 = new WaterMelon(2.00, 4.5, "India", true, "yes", 40.00, "12-10-2025", "GreenLand", "oval");
WaterMelon waterMelon2 = new WaterMelon(2.90, 4.5, "USA", false, "no", 50.00, "19-10-2025", "BlackLand", "oval");
WaterMelon waterMelon3 = new WaterMelon(3.10, 5.0, "India", true, "yes", 60.00, "20-10-2025", "Farm1", "round");
WaterMelon waterMelon4 = new WaterMelon(2.50, 3.5, "Brazil", false, "no", 45.00, "18-10-2025", "Farm2", "oval");
WaterMelon waterMelon5 = new WaterMelon(4.00, 6.0, "Mexico", true, "yes", 70.00, "15-10-2025", "Farm3", "round");
WaterMelon waterMelon6 = new WaterMelon(3.20, 4.8, "USA", false, "no", 55.00, "17-10-2025", "Farm4", "oval");
WaterMelon waterMelon7 = new WaterMelon(2.80, 4.2, "India", true, "yes", 48.00, "16-10-2025", "Farm5", "round");
WaterMelon waterMelon8 = new WaterMelon(3.50, 5.5, "Spain", false, "no", 65.00, "14-10-2025", "Farm6", "oval");
WaterMelon waterMelon9 = new WaterMelon(2.70, 4.0, "Italy", true, "yes", 52.00, "13-10-2025", "Farm7", "round");
WaterMelon waterMelon10 = new WaterMelon(3.90, 5.8, "Australia", false, "no", 68.00, "12-10-2025", "Farm8", "oval");
WaterMelon waterMelon11 = new WaterMelon(2.60, 4.3, "India", true, "yes", 47.00, "11-10-2025", "Farm9", "round");
WaterMelon waterMelon12 = new WaterMelon(3.30, 5.1, "USA", false, "no", 58.00, "10-10-2025", "Farm10", "oval");
WaterMelon waterMelon13 = new WaterMelon(4.10, 6.2, "Mexico", true, "yes", 75.00, "09-10-2025", "Farm11", "round");
WaterMelon waterMelon14 = new WaterMelon(2.40, 3.8, "Brazil", false, "no", 42.00, "08-10-2025", "Farm12", "oval");
WaterMelon waterMelon15 = new WaterMelon(3.00, 4.6, "India", true, "yes", 53.00, "07-10-2025", "Farm13", "round");
WaterMelon waterMelon16 = new WaterMelon(3.70, 5.6, "Spain", false, "no", 66.00, "06-10-2025", "Farm14", "oval");
WaterMelon waterMelon17 = new WaterMelon(2.90, 4.4, "Italy", true, "yes", 49.00, "05-10-2025", "Farm15", "round");
WaterMelon waterMelon18 = new WaterMelon(3.80, 5.9, "Australia", false, "no", 69.00, "04-10-2025", "Farm16", "oval");
WaterMelon waterMelon19 = new WaterMelon(2.30, 3.7, "India", true, "yes", 41.00, "03-10-2025", "Farm17", "round");
WaterMelon waterMelon20 = new WaterMelon(4.20, 6.5, "Mexico", false, "no", 80.00, "02-10-2025", "Farm18", "oval");
		
		WaterMelonStore waterMelonStore = new WaterMelonStore();
		
		waterMelonStore.store(waterMelon1);
		waterMelonStore.store(waterMelon2);
		waterMelonStore.store(waterMelon3);
		waterMelonStore.store(waterMelon4);
		waterMelonStore.store(waterMelon5);
		waterMelonStore.store(waterMelon6);
		waterMelonStore.store(waterMelon7);
		waterMelonStore.store(waterMelon8);
		waterMelonStore.store(waterMelon9);
		waterMelonStore.store(waterMelon10);
		waterMelonStore.store(waterMelon11);
		waterMelonStore.store(waterMelon12);
		waterMelonStore.store(waterMelon13);
		waterMelonStore.store(waterMelon14);
		waterMelonStore.store(waterMelon15);
		waterMelonStore.store(waterMelon16);
		waterMelonStore.store(waterMelon17);
		waterMelonStore.store(waterMelon18);
		waterMelonStore.store(waterMelon19);
		waterMelonStore.store(waterMelon20);
		
		waterMelonStore.display();
		

	}
}