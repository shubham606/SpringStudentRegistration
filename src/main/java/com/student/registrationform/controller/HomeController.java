package com.student.registrationform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.student.registrationform.dao.StudentDetailsDAO;
import com.student.registrationform.model.StudentDetails;

@Controller
public class HomeController {

	@Autowired
	StudentDetailsDAO studentDetailsDAO;

	@GetMapping(value = { "/", "index" })
	public String indexPage() {
		return "index";
	}

	/*
	 * @GetMapping("/login") public String loginPage() { return "login"; }
	 */

	@GetMapping("/register")
	public String registerPage(Model model) {
		List<StudentDetails> allStudents = studentDetailsDAO.getAllStudents();
		model.addAttribute("allStudents", allStudents);
		return "registration";
	}
}
