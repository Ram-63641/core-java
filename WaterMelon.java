/*
Declare below classes with 10 instance variables and init how ever you want.Add an instance method to display all instance variables ;
 WaterMelon, Screen, Silencer,Tissue,Laser,Cricket,SpaceShip,Broccoli,Glove,Movie Declare Store Classes for each above
 classes, then perform save and displayAll methods. Make Sure the range of array is 20
	*/
	
	
class WaterMelon{
	
    double weight;       
    double sugarContent; 
    String origin;      
    boolean isSeedless;  
    String ripeness;     
    double price;        
    String harvestDate;  
    String farmSource;   
    String shape;  
  
WaterMelon(double weight,double sugarContent,String origin,boolean isSeedless,String ripeness,double price,String harvestDate,String farmSource,String shape)
{
	
	this.weight=weight;
	this.sugarContent=sugarContent;
	this.origin=origin;
	this.isSeedless=isSeedless;
	this.ripeness=ripeness;
	this. price=price;
	this.harvestDate=harvestDate;
	this.farmSource=farmSource;
	this.shape=shape;
}
   void display()
   {
	   
	   System.out.println("weight:"+this.weight);
	   System.out.println("sugarContent:"+this.sugarContent);
	   System.out.println("origin:"+this.origin);
	   System.out.println("isSeedless:"+this.isSeedless);
	   System.out.println("ripness:"+this.ripeness);
	   System.out.println("price:"+this.price);
	   System.out.println("harvestDate:"+this.harvestDate);
	   System.out.println("farmSource:"+this.farmSource);
	   System.out.println("shape:"+this.shape);
   }
   
	   
   
   
	
	
	
}
 
	