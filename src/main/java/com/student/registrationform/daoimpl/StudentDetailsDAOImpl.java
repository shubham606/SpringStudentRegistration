package com.student.registrationform.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.registrationform.dao.StudentDetailsDAO;
import com.student.registrationform.model.StudentDetails;

@Repository(value = "studentDetailsDAO")
@Transactional
public class StudentDetailsDAOImpl implements StudentDetailsDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveOrUpdateStudentDetails(StudentDetails studentDetails) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(studentDetails);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteStudentDetails(StudentDetails studentDetails) {
		try {
			sessionFactory.getCurrentSession().delete(studentDetails);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public StudentDetails getStudentDetailsById(int studentid) {
		StudentDetails studentDetails = sessionFactory.getCurrentSession().get(StudentDetails.class, studentid);
		return studentDetails;
	}

	@SuppressWarnings("unchecked")
	public List<StudentDetails> getAllStudents() {

		return sessionFactory.getCurrentSession().createQuery("FROM StudentDetails").list();
	}

	public StudentDetails getStudentDetailsByName(String studentname) {
		
		StudentDetails studentDetails = sessionFactory.getCurrentSession().get(StudentDetails.class, studentname);
		return studentDetails;
	}


}
