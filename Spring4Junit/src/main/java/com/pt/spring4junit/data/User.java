package com.pt.spring4junit.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.pt.spring4junit.PtSpring4Junit;

@Document(collection = "user")
public class User implements PtSpring4Junit {

	@Id
	private String id;
	@Field("first_name")
	private String firstName;
	@Field("last_name")
	private String lastName;
	@Field("dob")
	private String dob;
	@Field("user_name")
	private String userName;
	@Field("password")
	private String password;
	@Field("gender")
	private String gender;
	@Field("city")
	private String city;
	@Field("state")
	private String state;
	@Field("country")
	private String country;
	@Field("phone_number")
	private String phoneNumber;
	@Field("sn_type")
	private String snType;

	/**
	 * Default constructor
	 */
	public User() {
		// TODO:
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param dob
	 * @param userName
	 * @param password
	 * @param gender
	 * @param city
	 * @param country
	 */
	public User(String id, String firstName, String lastName, String dob,
			String userName, String password, String gender, String city,
			String country, String state, String phoneNumber, String snType) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.snType = snType;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", userName=" + userName + ", password="
				+ password + ", gender=" + gender + ", city=" + city
				+ ", state=" + state + ", country=" + country
				+ ", phoneNumber=" + phoneNumber + ", snType=" + snType + "]";
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSnType() {
		return snType;
	}

	public void setSnType(String snType) {
		this.snType = snType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
