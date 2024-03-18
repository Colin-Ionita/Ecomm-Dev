package org.nadiaproject.ecommerce_project.service;

import org.nadiaproject.ecommerce_project.entity.UserCredentials;
import org.nadiaproject.ecommerce_project.entity.UserProfile;
import org.nadiaproject.ecommerce_project.userregistrationDTO.UserLogin;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void createUser(UserLogin userLogin);
}
