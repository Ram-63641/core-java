class CapRunner {
	
	public static void main(String[] args){
		
		Cap c1 = new Cap();
		
		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c1.brand + " \n Color = " + c1.color + " \n Price = " + c1.price + " \n Size = " + c1.size + " \n Adjustable = " + c1.isAdjustable+"\n");
		
		c1.brand="Nike"; 
		c1.color="Black";
		c1.price=799.5;
		c1.size=58;
		c1.isAdjustable=true;
		
		System.out.println("Updated Values:");
		System.out.println("Brand = "+c1.brand + " \n Color = " + c1.color + " \n Price =" + c1.price + "\n Size= " + c1.size + "\n Adjustable = " + c1.isAdjustable+"\n");
		
		
		Cap c2 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c2.brand + " \n Color = " + c2.color + " \n Price = " + c2.price + " \n Size = " + c2.size + " \n Adjustable = " + c2.isAdjustable+"\n");

		c2.brand="Adidas"; 
		c2.color="White";
		c2.price=699.0;
		c2.size=56;
		c2.isAdjustable=true;

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c2.brand + " \n Color = " + c2.color + " \n Price =" + c2.price + "\n Size= " + c2.size + "\n Adjustable = " + c2.isAdjustable+"\n");


		Cap c3 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c3.brand + " \n Color = " + c3.color + " \n Price = " + c3.price + " \n Size = " + c3.size + " \n Adjustable = " + c3.isAdjustable+"\n");

		c3.brand="Puma"; 
		c3.color="Blue";
		c3.price=599.0;
		c3.size=57;
		c3.isAdjustable=true;

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c3.brand + " \n Color = " + c3.color + " \n Price =" + c3.price + "\n Size= " + c3.size + "\n Adjustable = " + c3.isAdjustable+"\n");


		Cap c4 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c4.brand + " \n Color = " + c4.color + " \n Price = " + c4.price + " \n Size = " + c4.size + " \n Adjustable = " + c4.isAdjustable+"\n");

		c4.brand="Reebok"; 
		c4.color="Red";
		c4.price=499.0;
		c4.size=55;
		c4.isAdjustable=false;

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c4.brand + " \n Color = " + c4.color + " \n Price =" + c4.price + "\n Size= " + c4.size + "\n Adjustable = " + c4.isAdjustable+"\n");


		Cap c5 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c5.brand + " \n Color = " + c5.color + " \n Price = " + c5.price + " \n Size = " + c5.size + " \n Adjustable = " + c5.isAdjustable+"\n");

		c5.brand="UnderArmour"; 
		c5.color="Green";
		c5.price=850.0;
		c5.size=59;
		c5.isAdjustable=true;

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c5.brand + " \n Color = " + c5.color + " \n Price =" + c5.price + "\n Size= " + c5.size + "\n Adjustable = " + c5.isAdjustable+"\n");
	}
}