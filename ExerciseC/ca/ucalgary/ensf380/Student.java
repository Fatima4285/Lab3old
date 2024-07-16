
public class Student extends Person{
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	//constructors
	public Student() {
		super(); //default constructor from abstract class
	}
	
	public Student(String name, String phoneNumber, String emailAddress, Address address, 
            String studentNumber, Professor supervisor, double averageMark) {
		 super(name, phoneNumber, emailAddress, address); // Call Person constructor
		 this.studentNumber = studentNumber;
		 this.supervisor = supervisor;
		 this.averageMark = averageMark;
	}
	
	//setters
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}
	
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	//getters
	public String getStudentNumber() {
		return this.studentNumber;
	}
	
	public Professor getSupervisor() {
		return this.supervisor;
	}
	
	public double getAverageMark() {
		return this.averageMark;
	}
	
	//methods
	public boolean isEligibleToEnroll() {
		if(studentNumber != null && supervisor != null && averageMark >= 50.00) { //mark is a percentage
			return true;
		}else {
			return false;
		}
	}
}
