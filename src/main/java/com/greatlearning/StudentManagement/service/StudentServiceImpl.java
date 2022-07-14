package com.greatlearning.StudentManagement.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.StudentManagement.entity.Student;
import com.greatlearning.StudentManagement.repository.StudentRepository;
@Repository
public class StudentServiceImpl implements StudentService{
	@Autowired
private StudentRepository studentRepository;
	@Override
public List<Student> findAll() {
		
		return studentRepository.findAll();
		
}
		public void save(Student theStudent) {

			studentRepository.save(theStudent);

		



	}
		public Student findById(int id) {

			return studentRepository.findById(id).get();
			
		}
		@Override
		public void deleteById(int theId) {
			
			studentRepository.deleteById(theId);
			
		}



		




}
