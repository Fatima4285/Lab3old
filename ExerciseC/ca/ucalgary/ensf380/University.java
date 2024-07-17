package ca.ucalgary.ensf380;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an Address
		Address address1 = new Address("Downtown street", "Calgary", "AB", "T1Y6Y6", "Canada");
		
		//Create Students 
		Student student1 = new Student();
		
		
		//Hire a Professor
		Professor supervisor = new Professor("T1", 21000.32);
		
		//Update supervisors teacher Number
		supervisor.nextPersonalNumber(3);
		
		//
		
		

	}

}
