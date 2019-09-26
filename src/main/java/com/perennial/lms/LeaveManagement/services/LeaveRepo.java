package com.perennial.lms.LeaveManagement.services;

import com.perennial.lms.LeaveManagement.entity.LeaveMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveMasterEntity, Integer> {

}
