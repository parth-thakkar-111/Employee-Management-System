package com.ems.ems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems.entity.LeaveInfoEmployees;

@Repository
public interface LeaveEmployeeRepo extends CrudRepository<LeaveInfoEmployees,Integer>{

}
