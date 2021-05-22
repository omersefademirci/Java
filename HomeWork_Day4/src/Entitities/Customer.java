package Entitities;
import java.time.LocalDate;


import Abstract.Entity;
public class Customer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationality;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationality) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth =dateOfBirth;
		this.nationality = nationality;
		
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateofBirth) {
		
		
		this.dateOfBirth = dateofBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
