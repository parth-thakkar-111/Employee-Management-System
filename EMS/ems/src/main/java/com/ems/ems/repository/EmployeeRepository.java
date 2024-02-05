package com.ems.ems.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems.entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
