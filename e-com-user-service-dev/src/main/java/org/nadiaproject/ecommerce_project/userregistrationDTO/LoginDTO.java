package org.nadiaproject.ecommerce_project.userregistrationDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginDTO {
    //USER CREDENTIALS FIELDS

    @Email
    @NotBlank(message = "Email Required")
    private String email;
    @Size(min = 8, message = "Password should be Minimum 8 Character")
    private String password;
    //USER PROFILE FIELDS
    @NotBlank(message = "FirstName is Required")
    private String firstName;
    @NotBlank(message = "LastName is Required")
    private String lastName;
    @Size(min = 10, message = "Please Enter Valid Phone Number")
    private int phone;
    private String deliveryInstructions;
    //Address details
    private String streetAddress;
    private int apartment_Number;
    private String City;
    private String State;
    @Size(min = 5, message = "Please Enter Valid ZipCode")
    private int zipCode;
    private String Country;
    /// Constructors


    public LoginDTO() {
    }

    public LoginDTO(String email, String password, String firstName, String lastName,
                    int phone, String deliveryInstructions, String streetAddress,
                    int apartment_Number, String city, String state,
                    int zipCode, String country) {

        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.deliveryInstructions = deliveryInstructions;
        this.streetAddress = streetAddress;
        this.apartment_Number = apartment_Number;
        City = city;
        State = state;
        this.zipCode = zipCode;
        Country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getApartment_Number() {
        return apartment_Number;
    }

    public void setApartment_Number(int apartment_Number) {
        this.apartment_Number = apartment_Number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
