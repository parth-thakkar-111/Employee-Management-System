package com.ems.ems.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeAttendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendance_id;

	private int employeeId;
	private LocalDate date;
	private LocalTime signIn;
	private LocalTime signOut;
	private float totalHours;
	private String attendanceCategory;
	public EmployeAttendance(int attendance_id, int employeeId, LocalDate date, LocalTime signIn, LocalTime signOut,
			float totalHours, String attendanceCategory) {
		super();
		this.attendance_id = attendance_id;
		this.employeeId = employeeId;
		this.date = date;
		this.signIn = signIn;
		this.signOut = signOut;
		this.totalHours = totalHours;
		this.attendanceCategory = attendanceCategory;
	}
	public EmployeAttendance() {
		
	}
	public int getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getSignIn() {
		return signIn;
	}
	public void setSignIn(LocalTime signIn) {
		this.signIn = signIn;
	}
	public LocalTime getSignOut() {
		return signOut;
	}
	public void setSignOut(LocalTime signOut) {
		this.signOut = signOut;
	}
	public float getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(float totalHours) {
		this.totalHours = totalHours;
	}
	public String getAttendanceCategory() {
		return attendanceCategory;
	}
	public void setAttendanceCategory(String attendanceCategory) {
		this.attendanceCategory = attendanceCategory;
	}
}
	
	