package com.ems.ems.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ems.ems.entity.EmployeAttendance;

public interface EmployeeAttendanceImpl extends JpaRepository<EmployeAttendance, Integer> {
	List<EmployeAttendance> findAllByEmployeeId(int id);
	EmployeAttendance findByEmployeeId(int id);
	EmployeAttendance findByEmployeeIdAndDate(int id,LocalDate date);

}
