package com.java.httpPractice.domain.repositories;

import com.java.httpPractice.domain.entities.EmployeeInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInHospitalRepository extends JpaRepository<EmployeeInformation,Long> {
}
