package com.perennial.lms.LeaveManagement.services;

import com.perennial.lms.LeaveManagement.entity.EmployeeMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeMasterEntity,String> {
}
