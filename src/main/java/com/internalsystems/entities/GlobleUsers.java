package com.internalsystems.entities;



import com.internalsystems.Utils.Status;
import com.internalsystems.loginSystem.GlobleUserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity	
@Table(name = "globle_user")
public class GlobleUsers {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;

	@Column(columnDefinition = "TEXT CHECK (email ~* '[a-zA-Z0-9._%+-]+@d2soft-intel\\.com')")
    private String email;
		
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'Admin'")
	private String role;
	@Column(unique = true)
    private String phoneNumber;
	@Enumerated(EnumType.STRING)
	private Status status;
	private String password;
	
	
	public GlobleUsers(GlobleUserDTO userDTO) {
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.email = userDTO.getEmail();
        this.streetAddress = userDTO.getStreetAddress();
        this.city = userDTO.getCity();
        this.state = userDTO.getState();
        this.country = userDTO.getCountry();
        this.zipcode = userDTO.getZipcode();
        this.role = userDTO.getRole();
        this.phoneNumber = userDTO.getPhoneNumber();
        this.status = userDTO.getStatus();
        this.password = userDTO.getPassword();
    }
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
}
