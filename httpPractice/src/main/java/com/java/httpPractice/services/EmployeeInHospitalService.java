package com.java.httpPractice.services;

import com.java.httpPractice.domain.entities.EmployeeInformation;
import com.java.httpPractice.domain.repositories.EmployeeInHospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInHospitalService {

    private final EmployeeInHospitalRepository inHospitalRepository;


    public EmployeeInHospitalService(EmployeeInHospitalRepository inHospitalRepository) {
        this.inHospitalRepository = inHospitalRepository;
    }

    public List<EmployeeInformation> getEmployees(){
        return  inHospitalRepository.findAll();
    }


public EmployeeInformation createEmployee(EmployeeInformation employeeInformation){
        return inHospitalRepository.save(employeeInformation);
}


}
