package ca.ucalgary.ensf380;

class Professor extends Person{

	private String teacherNumber;
	private double salary;
	

	//constructors
	public Professor(String name, String phoneNumber, String emailAddress, Address address) {
		super(name, phoneNumber, emailAddress, address);
	}

    public Professor(String name, String phoneNumber, String emailAddress, Address address, String teacherNumber, double salary) {
        super(name, phoneNumber, emailAddress, address);
        setTeacherNumber(teacherNumber);
        setSalary(salary);
    }
	
	//setters
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//getters
	public String getTeacherNumber() {
		return teacherNumber;
	}
	
	public double getSalary() {
		return salary;
	}
}
