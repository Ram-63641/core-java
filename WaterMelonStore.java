class WaterMelonStore{

WaterMelon[] watermelon= new WaterMelon[20];
int index=0;

void store(WaterMelon watermelon)
{
	if(watermelon != null){
		
		if(this.index<this.watermelon.length){
		this.watermelon[this.index]=watermelon;
		System.out.println("Successfully saved to index: " + this.index);
		this.index++;
            } 
	}
	else{
	System.out.println("The array is null ");
	}
	
	
}
       void display()
	   {
		   for (WaterMelon arr: this.watermelon){
			   
			   if(arr != null){
				   
				   arr.display();
			   }
		   }
	   }
}
