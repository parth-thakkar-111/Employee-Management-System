package com.ems.ems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems.entity.Role;
/*CrudRepository implements basic CRUD operations, including count, delete, deleteById, save, saveAll, findById, and findAll.*/

@Repository
public interface RoleRepo extends CrudRepository<Role,Integer>{

	
}
