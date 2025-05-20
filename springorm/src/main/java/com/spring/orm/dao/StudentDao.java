package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	
	//insert --> create 
	@Transactional
	public int insert(Student student) {
		Integer r = (Integer) hibernateTemplate.save(student);
		return r;
	}
	
	
	//read single object
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	// read multiple object
	public List<Student> getAll(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	
	// delete
	@Transactional
	public void delete(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	
	// update
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}


