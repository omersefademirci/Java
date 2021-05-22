package entities.conctretes;

import java.time.LocalDate;

import entities.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private LocalDate dateOfBirth;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nationaltyId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.dateOfBirth = dateOfBirth;
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
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
