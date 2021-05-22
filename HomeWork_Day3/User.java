
public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String nationality;
	private int age;
	private String gender;
	
	public  User() {
		
	}
	public User(int id, String firstName,String lastName, int age,String gender, String nationality) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.nationality=nationality;
		this.age=age;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
