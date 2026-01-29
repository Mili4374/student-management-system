package com.zili.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zili.entity.Student;
import com.zili.repository.StudentRepository;

@Service
public class ServiceImpl implements StudentService {
	@Autowired
	StudentRepository StudentRepositroy;
	@Override
	public List<Student> getAllStudents() {
		List<Student> list = StudentRepositroy.findAll();
		return list;
	}
	@Override
	public Student saveStudent(Student student) {
		
		return StudentRepositroy.save(student);
	}
	@Override
	public Student getById(int id) {
		
		return StudentRepositroy.findById(id).get();
	}
	@Override
	public void deleteById(int id) {
		StudentRepositroy.deleteById(id);
		
	}

}
