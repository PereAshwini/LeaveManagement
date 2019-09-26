package com.perennial.lms.LeaveManagement.services;

import com.perennial.lms.LeaveManagement.controller.CompoffController;
import com.perennial.lms.LeaveManagement.entity.CompoffMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CompoffRepo extends JpaRepository<CompoffMasterEntity,Integer> {

}
