package org.nadiaproject.ecommerce_project.entity;

import jakarta.persistence.*;

@Entity
public class UserCredentials {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(nullable = false, unique = true)
    private String password;
   @Column(nullable = false)
    public String email;
    @OneToOne(mappedBy = "userCredentials", cascade = CascadeType.ALL)
    private UserProfile userProfile;

    public UserCredentials(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public UserCredentials(String email, String password){
        this.email = email;
        this.password = password;
    }

    public UserCredentials() {

    }

    public String getPassword() {
        return password;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
