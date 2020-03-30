package com.student.registrationform.dao;

import java.util.List;

import com.student.registrationform.model.StudentDetails;

public interface StudentDetailsDAO {

	public boolean saveOrUpdateStudentDetails(StudentDetails studentDetails);

	public boolean deleteStudentDetails(StudentDetails studentDetails);
	public StudentDetails getStudentDetailsById(int studentid);
	public StudentDetails getStudentDetailsByName(String studentname);

	public List<StudentDetails> getAllStudents();
}
