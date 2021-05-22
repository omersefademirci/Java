
public class Student extends User {
	private int id;
	private String firstName;
	private String lastName;
	private int successRate;
	public Student() {
		
	}
	public Student(int id, String firstName, String lastName, int successRate) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.successRate = successRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSuccessRate() {
		return successRate;
	}
	public void setSuccessRate(int successRate) {
		this.successRate = successRate;
	}
	


}
