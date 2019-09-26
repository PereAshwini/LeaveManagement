package com.perennial.lms.LeaveManagement.services;

import com.perennial.lms.LeaveManagement.entity.TeamMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<TeamMasterEntity,Integer> {
}
