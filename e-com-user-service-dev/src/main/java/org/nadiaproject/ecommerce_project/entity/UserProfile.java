package org.nadiaproject.ecommerce_project.entity;

import jakarta.persistence.*;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private int phone;
    private String deliveryInstructions;
    @OneToOne
    private Address address;
    @OneToOne
    public UserCredentials userCredentials;

    // Constructors
    public UserProfile() {
    }
    public UserProfile(String first_name, String last_name, int phone, String deliveryInstructions, Address address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.deliveryInstructions = deliveryInstructions;
        this.address = address;
    }

    public UserProfile(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
}
