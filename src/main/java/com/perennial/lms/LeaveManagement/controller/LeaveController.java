package com.perennial.lms.LeaveManagement.controller;

import com.perennial.lms.LeaveManagement.entity.EmployeeMasterEntity;
import com.perennial.lms.LeaveManagement.entity.LeaveMasterEntity;
import com.perennial.lms.LeaveManagement.services.EmployeeRepo;
import com.perennial.lms.LeaveManagement.services.LeaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {
    @Autowired
    private LeaveRepo leaveRepo;

    @RequestMapping(value = "/addLeaveMasterRecord", method = RequestMethod.POST)
    public LeaveMasterEntity addLeaveMasterRecordaddLeaveMasterRecord(@RequestBody LeaveMasterEntity leaveData){
        leaveRepo.save(leaveData);
        return leaveData;
    }
}
