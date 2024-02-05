package com.ems.ems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems.entity.ApplyLeave;

@Repository
public interface ApplyLeaveRepo extends CrudRepository<ApplyLeave,Integer>{

}
