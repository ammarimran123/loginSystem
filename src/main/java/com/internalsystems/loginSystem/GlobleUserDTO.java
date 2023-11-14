package com.internalsystems.loginSystem;

import com.internalsystems.Utils.Status;
import com.internalsystems.entities.GlobleUsers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class GlobleUserDTO {
	private String firstName;
	private String lastName;
    
	@Email(message = "Please enter a valid email Id", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
    @NotNull(message = "Please enter a valid email Id")
	private String email;
	
	@NotNull(message = "Please enter a valid Address")
	private String streetAddress;
	@NotEmpty(message = "Please enter a valid city")
	private String city;
	private String state;
	private String country;
	private String zipcode;
	private String role;
	private String phoneNumber;
	private Status status;
	private String password;

	public GlobleUserDTO() {
    }

	 public GlobleUserDTO(GlobleUsers user) {
	        this.firstName = user.getFirstName();
	        this.lastName = user.getLastName();
	        this.email = user.getEmail();
	        this.streetAddress = user.getStreetAddress();
	        this.city = user.getCity();
	        this.state = user.getState();
	        this.country = user.getCountry();
	        this.zipcode = user.getZipcode();
	        this.role = user.getRole();
	        this.phoneNumber = user.getPhoneNumber();
	        this.status = user.getStatus();
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
