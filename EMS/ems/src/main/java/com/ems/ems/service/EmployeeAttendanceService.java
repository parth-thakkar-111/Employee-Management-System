package com.ems.ems.service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ems.ems.entity.EmployeAttendance;
import com.ems.ems.execption.EmployeeNotFoundException;
import com.ems.ems.repository.EmployeeAttendanceImpl;


@Service
public class EmployeeAttendanceService {
	
	
	@Autowired
	private EmployeeAttendanceImpl employeeAttendanceRepo;

	
	public EmployeAttendance findAttendanceByEmployeeId(int id) throws EmployeeNotFoundException{
		try {
			return employeeAttendanceRepo.findByEmployeeId(id);
		}
		catch (NoSuchElementException ex) {
	//		throw new EmployeeNotFoundException("Could not find any employee with ID " + id);
			return null;
		}
	}


	public List <EmployeAttendance> findAllAttendanceByEmployeeId(int id) throws EmployeeNotFoundException{
		try {
			return employeeAttendanceRepo.findAllByEmployeeId(id);
		}
		catch (NoSuchElementException ex) {
	//		throw new EmployeeNotFoundException("Could not find any employee with ID " + id);
			return null;
		}
	}

	
	public List<EmployeAttendance> getAllEmployeeAttendance(){
		
		return (List<EmployeAttendance>)employeeAttendanceRepo.findAll();
	}

	public EmployeAttendance saveEmployeeAttendance(EmployeAttendance obj) {
		EmployeAttendance emp=employeeAttendanceRepo.save(obj);
		return emp;		
	}
	
	public EmployeAttendance employeeAttendanceByIdandDate(int id,LocalDate date) {
		
		try {
			return employeeAttendanceRepo.findByEmployeeIdAndDate(id, date);
		}
		
		catch (NoSuchElementException ex) {
	//		throw new EmployeeNotFoundException("Could not find any employee with ID " + id);
			return null;
		}


	}

}
