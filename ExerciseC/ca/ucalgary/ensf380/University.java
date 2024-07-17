package ca.ucalgary.ensf380;

class University {

	public static void main(String[] args) {
		 System.out.println("\n-------------------- Welcome to the student and professor information system! -------------------- ");
		 
		Address address1 = new Address("Downtown street", "Calgary", "AB", "T1Y6Y6", "Canada");
		
		System.out.println("\nConfirming New Address...\n");
		
		// Validate address and get the message
		//Chatgpt was used to help generate this if-else statement, but was modified significantly
        String validationMessage = address1.validate();
        if (validationMessage.equals("Address is valid.\n")) {
            System.out.println(validationMessage);
        } else {
            System.out.println("Invalid address provided: " + validationMessage);
            return;
        }
		

        // Create students that are roommates
        Student student1 = new Student("John Doe", "4033334444", "john.doe@ucalgary.ca", address1);
        Student student2 = new Student("Jane Doe", "4031112222", "jane.doe@ucalgary.ca", address1);

        // Add Student Number and grades for Students
        student1.setAverageMark(53.00);
        student2.setAverageMark(48.00);

        student1.setStudentNumber("30160475");
        student2.setStudentNumber("30160474");

        // Check if the students are eligible to enroll
        student1.isEligibleToEnroll();
        student2.isEligibleToEnroll();
        

        // Hire a Professor
        Address profAddress = new Address("University Blvd", "Calgary", "AB", "T2N1N4", "Canada");
        Professor supervisor = new Professor("Dr. Ansari", "403-123-4567", "dr.Ansari@university.ca", address1, "3014589", 21000.32);
        
        //Student will enroll in Professor's Class
        student1.setSupervisor(supervisor);
        
        System.out.println("\nStudent is Successfully enrolled in " + supervisor.getName() + " class\n");

        // Update supervisor's teacher Number
        String newTeacherNumber = supervisor.nextPersonalNumber((short)3);
        supervisor.setTeacherNumber(newTeacherNumber);
        
        // Output student and professor details

        System.out.println("Student Information:");

        System.out.println("Name: " + student1.getName());

        System.out.println("Phone: " + student1.getPhoneNumber());

        System.out.println("Email: " + student1.getEmailAddress());

        System.out.println("Address: " + student1.getAddress().outputAsLabel());

        System.out.println("Student Number: " + student1.getStudentNumber());

        System.out.println("Supervisor: " + student1.getSupervisor().getName());

        System.out.println("Average Mark: " + student1.getAverageMark());

       

        System.out.println("\nProfessor Information:");

        System.out.println("Name: " + supervisor.getName());

        System.out.println("Phone: " + supervisor.getPhoneNumber());

        System.out.println("Email: " + supervisor.getEmailAddress());

        System.out.println("Address: " + supervisor.getAddress().outputAsLabel());

        System.out.println("Teacher Number: " + supervisor.getTeacherNumber());

        System.out.println("Salary: $" + supervisor.getSalary() + " annually");

    }
	

}
