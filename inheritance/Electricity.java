class Electricity{
	 
	 int voltage;
	 String branch;
	 
	 Electricity(int voltage, String branch){
		 this.voltage = voltage;
		 this.branch = branch;
	 }
	 
	 void display(){
		System.out.println("Voltage : " + this.voltage);
		System.out.println("Branch : " + this.branch);
	}
 }