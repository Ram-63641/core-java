class WaterMelonStoreRunner{
	
	public static void main(String[] args){
		
		WaterMelon waterMelon1 = new WaterMelon(2.00, 4.5, "India", true, "yes", 40.00, "12-10-2025", "GreenLand", "oval");
		WaterMelon waterMelon2 = new WaterMelon(2.90, 4.5, "uSA", false, "no", 40.00, "19-10-2025", "BlackLand", "oval");
		
		WaterMelonStore waterMelonStore = new WaterMelonStore();
		
		waterMelonStore.store(waterMelon1);
		waterMelonStore.store(waterMelon2);
		
		waterMelonStore.display();
		

	}
}