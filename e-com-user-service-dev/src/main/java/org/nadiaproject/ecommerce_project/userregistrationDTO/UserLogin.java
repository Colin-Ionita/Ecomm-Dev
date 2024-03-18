package org.nadiaproject.ecommerce_project.userregistrationDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserLogin(
        @Email(message = "Email Required") String email,
        @NotBlank(message = "password cannot be Empty") @Size(min = 8,message = "Passw") String password,
        @NotBlank(message = "FirstName Required") String firstName,
        @NotBlank(message = "LastName is Required") String lastName,
        @NotBlank(message = "Phone Number is Required ") String phoneNumber,
        String deliveryInstructions,
        @NotBlank(message = "Street address is required") String streetAddress,
        String apartmentNumber,
        @NotBlank(message = "City is required") String city,
        @NotBlank(message = "State is required") String state,
        @NotBlank(message = "Zip code is required") String zipCode,
        @NotBlank(message = "Country is required") String country

) { }
