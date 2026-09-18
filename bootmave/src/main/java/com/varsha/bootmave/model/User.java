package com.varsha.bootmave.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Users")

public class User{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

	@Column(nullable = false)
    private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false,unique = true)
    private String email;
	
    public User(String id, String firstName,String lastName,String email){
        this.id=id;
        this.firstName =firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getId(){
        return id;
    }
	public void setId(String id) {
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
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}