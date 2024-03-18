package org.nadiaproject.ecommerce_project.repository;

import org.nadiaproject.ecommerce_project.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
