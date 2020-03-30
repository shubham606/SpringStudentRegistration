package com.student.registrationform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.registrationform.dao.StudentDetailsDAO;
import com.student.registrationform.model.StudentDetails;

@Controller
public class StudentDetailsController {

	@Autowired
	private StudentDetailsDAO studentDetailsDAO;

	@GetMapping("/studentDetails")
	public String studentDetailsPage(Model model) {
		List<StudentDetails> allStudents = studentDetailsDAO.getAllStudents();
		model.addAttribute("allStudents", allStudents);
		model.addAttribute("student", new StudentDetails());
		return "studentDetails";
	}

	@PostMapping("/student/add")
	public String getStudentDetails(@ModelAttribute("student") StudentDetails student, Model model) {
			studentDetailsDAO.saveOrUpdateStudentDetails(student);
		return "redirect:/studentDetails";
	}

	@GetMapping("/remove/{studentId}")
	public String deleteStudent(@PathVariable("studentId") int studentId) {
		StudentDetails studentDetails = studentDetailsDAO.getStudentDetailsById(studentId);
		studentDetailsDAO.deleteStudentDetails(studentDetails);
		return "redirect:/studentDetails";
	}
	@GetMapping("/update/{studentId}")
	public String updateStudent(@PathVariable("studentId") int studentId, Model model) {
		StudentDetails studentDetails = studentDetailsDAO.getStudentDetailsById(studentId);
		model.addAttribute("student", studentDetails);
		return "studentDetails";
	}
}