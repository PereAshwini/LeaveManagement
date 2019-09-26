package com.perennial.lms.LeaveManagement.controller;

import com.perennial.lms.LeaveManagement.entity.EmployeeMasterEntity;
import com.perennial.lms.LeaveManagement.services.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping(value = "/addEmployeeMasterRecord", method = RequestMethod.POST)
    public EmployeeMasterEntity addEmployeeMasterRecord(@RequestBody EmployeeMasterEntity empData){
        employeeRepo.save(empData);
        return empData;
    }
}
