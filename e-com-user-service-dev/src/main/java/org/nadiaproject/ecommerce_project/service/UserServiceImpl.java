package org.nadiaproject.ecommerce_project.service;

import jakarta.transaction.Transactional;
import org.nadiaproject.ecommerce_project.entity.Address;
import org.nadiaproject.ecommerce_project.entity.UserProfile;
import org.nadiaproject.ecommerce_project.repository.AddressRepository;
import org.nadiaproject.ecommerce_project.repository.UserCrendentialsRepository;
import org.nadiaproject.ecommerce_project.entity.UserCredentials;
import org.nadiaproject.ecommerce_project.repository.UserProfileRepository;
import org.nadiaproject.ecommerce_project.userregistrationDTO.LoginDTO;
import org.nadiaproject.ecommerce_project.userregistrationDTO.UserLogin;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeParseException;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserCrendentialsRepository userCrendentialsRepository;
    private final UserProfileRepository userProfileRepository;
    private final AddressRepository addressRepository;
    public UserServiceImpl(UserCrendentialsRepository userCrendentialsRepository, UserProfileRepository userProfileRepository, AddressRepository addressRepository) {
        this.userCrendentialsRepository = userCrendentialsRepository;

        this.userProfileRepository = userProfileRepository;

        this.addressRepository = addressRepository;
    }


    @Override
    @Transactional(rollbackOn = {DateTimeParseException.class, RuntimeException.class})

    public void createUser(UserLogin userLogin) {
        Address address = new Address(userLogin.streetAddress(), userLogin.apartmentNumber(),
                userLogin.city(), userLogin.state(),
                Integer.parseInt(userLogin.zipCode()), userLogin.country());
        address = addressRepository.save(address);


        UserProfile userProfile = new UserProfile();
        userProfile.setFirst_name(userLogin.firstName());
        userProfile.setLast_name(userLogin.lastName());
        userProfile.setPhone(Integer.parseInt(userLogin.phoneNumber()));
        userProfile.setDeliveryInstructions(userLogin.deliveryInstructions());
        userProfile.setAddress(address);
        // USER PROFILE Fields
        userProfile.setFirst_name(userLogin.firstName());
        userProfile.setLast_name(userLogin.lastName());
        userProfile.setPhone(Integer.parseInt(userLogin.phoneNumber()));
        userProfile.setDeliveryInstructions(userLogin.deliveryInstructions());
        userProfileRepository.save(userProfile);
        UserCredentials userCredentials = new UserCredentials();
        userCredentials.setEmail(userLogin.email());
        userCredentials.setPassword(userLogin.password());
        userProfile.setUserCredentials(userCredentials);
        userCredentials.setUserProfile(userProfile);

        userCrendentialsRepository.save(userCredentials);

        /// set these into objects
        // set the user profile and add
        //

    }
}



