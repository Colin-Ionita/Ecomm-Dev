package org.nadiaproject.ecommerce_project.repository;

import org.nadiaproject.ecommerce_project.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
