package com.perennial.lms.LeaveManagement.controller;

import com.perennial.lms.LeaveManagement.entity.CompoffMasterEntity;
import com.perennial.lms.LeaveManagement.entity.TeamMasterEntity;
import com.perennial.lms.LeaveManagement.services.CompoffRepo;
import com.perennial.lms.LeaveManagement.services.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompoffController {

    @Autowired
    private CompoffRepo compoffRepo;

    @RequestMapping(value = "/addCompoffMasterRecord", method = RequestMethod.POST)
    public CompoffMasterEntity addCompoffMasterRecord(@RequestBody CompoffMasterEntity compoffData){
        compoffRepo.save(compoffData);
        return compoffData;
    }

}
