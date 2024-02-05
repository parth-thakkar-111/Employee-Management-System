package com.ems.ems.controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.ems.ems.entity.ApplyLeave;
import com.ems.ems.entity.EmployeAttendance;
import com.ems.ems.entity.Employee;
import com.ems.ems.entity.Role;
import com.ems.ems.execption.EmployeeNotFoundException;
import com.ems.ems.service.EmployeeService;
import com.ems.ems.service.LeaveEmployeeService;

@SessionAttributes("id")
@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService service;

	@Autowired
	public LeaveEmployeeService leservice;
	
	


	// because of thymeleaf template engine you don't have to say login.html and can
	// directly say return "login"

	@GetMapping("/employees/update/{empId}")
	public String viewUpdateEmployeeDetails(Model model, @PathVariable(name = "empId") int empId,HttpSession session)
			throws EmployeeNotFoundException {

		if (session.getAttribute("id") != null) {
		  Employee emp = service.findEmployeeById(empId);
		  List<Role> li = service.getRoles();
		  model.addAttribute("employee", emp);
		  model.addAttribute("listRoles", li);
		  model.addAttribute("title", "Update employee id:" + empId);
		  return "employeeform";
		}
		else
			return "login";
	}

	
    //employee can view his details
	@GetMapping(value = "/employees/empprofile/view/{empId}")
	public String getPersonalDetails(Model model, @PathVariable(name = "empId") int empId,HttpSession session)
			throws EmployeeNotFoundException {
		if (session.getAttribute("id") != null) {
		   Employee emp = service.findEmployeeById(empId);
		   model.addAttribute("employee", emp);
		   return "viewemployeeprofile";
		}
		else
			return "login";
	}
    //http://localhost:8080/employees/leave/applyNew/2
	@GetMapping("/employees/leave/applyNew/{empId}")
	public String applyForLeave(Model model, @PathVariable(name = "empId") int empId,HttpSession session) {

		if (session.getAttribute("id") != null) {
		   ApplyLeave obj = new ApplyLeave();
		   obj.setEmployeeId(empId);
		   model.addAttribute("applyLeave", obj);

		   return "ApplyForLeave";
		}//close if for session
		else
			return "login";
	  }

	@GetMapping("/employees/attendance/view/{empId}")
	public String markAttendance(Model model, @PathVariable(name = "empId") int empId,HttpSession session) {

		if (session.getAttribute("id") != null) {
		   EmployeAttendance obj = new EmployeAttendance();
		   
		   obj.setEmployeeId(empId);
		   model.addAttribute("attendance", obj);

		   return "EmployeeAttendance";
		}//close if for session
		else
			return "login";
	  }
	
	@GetMapping("/employees/attendance/back/{empId}")
	public String backEmployee(Model model, @PathVariable(name = "empId") int empId,HttpSession session) throws EmployeeNotFoundException {
	
		Employee em=service.findEmployeeById(empId);
		model.addAttribute("employee",em);
		model.addAttribute("message","back to employee page");
		return "employeeDetails";
   
	
	}}
