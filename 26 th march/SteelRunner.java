class SteelRunner {
	
	public static void main(String[] args){
		
		Steel s1 = new Steel();
		
		System.out.println("Default Values: ");
		System.out.println("Type = "+ s1.type + " \n Weight = " + s1.weight + " \n Grade = " + s1.grade + " \n Price = " + s1.price + " \n RustFree = " + s1.isRustFree+"\n");
		
		s1.type="Alloy"; 
		s1.weight=12.5;
		s1.grade=5;
		s1.price=800.5;
		s1.isRustFree=true;
		
		System.out.println("Updated Values:");
		System.out.println("Type = "+s1.type + " \n Weight = " + s1.weight + " \n Grade =" + s1.grade + "\n Price= " + s1.price + "\n RustFree = " + s1.isRustFree+"\n");
		
		
		Steel s2 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s2.type + " \n Weight = " + s2.weight + " \n Grade = " + s2.grade + " \n Price = " + s2.price + " \n RustFree = " + s2.isRustFree+"\n");

		s2.type="Carbon Steel"; 
		s2.weight=10.0;
		s2.grade=4;
		s2.price=600.0;
		s2.isRustFree=false;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s2.type + " \n Weight = " + s2.weight + " \n Grade =" + s2.grade + "\n Price= " + s2.price + "\n RustFree = " + s2.isRustFree+"\n");


		Steel s3 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s3.type + " \n Weight = " + s3.weight + " \n Grade = " + s3.grade + " \n Price = " + s3.price + " \n RustFree = " + s3.isRustFree+"\n");

		s3.type="Stainless Steel"; 
		s3.weight=15.0;
		s3.grade=6;
		s3.price=1000.0;
		s3.isRustFree=true;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s3.type + " \n Weight = " + s3.weight + " \n Grade =" + s3.grade + "\n Price= " + s3.price + "\n RustFree = " + s3.isRustFree+"\n");


		Steel s4 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s4.type + " \n Weight = " + s4.weight + " \n Grade = " + s4.grade + " \n Price = " + s4.price + " \n RustFree = " + s4.isRustFree+"\n");

		s4.type="Tool Steel"; 
		s4.weight=18.0;
		s4.grade=7;
		s4.price=1200.0;
		s4.isRustFree=false;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s4.type + " \n Weight = " + s4.weight + " \n Grade =" + s4.grade + "\n Price= " + s4.price + "\n RustFree = " + s4.isRustFree+"\n");


		Steel s5 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s5.type + " \n Weight = " + s5.weight + " \n Grade = " + s5.grade + " \n Price = " + s5.price + " \n RustFree = " + s5.isRustFree+"\n");

		s5.type="Mild Steel"; 
		s5.weight=9.5;
		s5.grade=3;
		s5.price=500.0;
		s5.isRustFree=false;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s5.type + " \n Weight = " + s5.weight + " \n Grade =" + s5.grade + "\n Price= " + s5.price + "\n RustFree = " + s5.isRustFree+"\n");
	}
}