package com.perennial.lms.LeaveManagement.controller;

import com.perennial.lms.LeaveManagement.entity.EmployeeMasterEntity;
import com.perennial.lms.LeaveManagement.entity.TeamMasterEntity;
import com.perennial.lms.LeaveManagement.services.EmployeeRepo;
import com.perennial.lms.LeaveManagement.services.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamRepo teamRepo;

    @RequestMapping(value = "/addTeamMasterRecord", method = RequestMethod.POST)
    public TeamMasterEntity addTeamMasterRecord(@RequestBody TeamMasterEntity teamData){
        teamRepo.save(teamData);
        return teamData;
    }

}
