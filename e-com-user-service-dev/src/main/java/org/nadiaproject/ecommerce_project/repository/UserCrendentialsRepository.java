package org.nadiaproject.ecommerce_project.repository;

import org.nadiaproject.ecommerce_project.entity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCrendentialsRepository extends JpaRepository<UserCredentials,Long> {
}
