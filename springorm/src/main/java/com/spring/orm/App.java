package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
    	StudentDao studentDao = (StudentDao) context.getBean("studentDao");
    	
//    	Student student = new Student(222,"raj","cse");
//    	int r = studentDao.insert(student);
//    	System.out.println("done" + r);
    	
//    	  Student s = studentDao.getStudent(222);
//          System.out.println("Student Details: " + s);
//        
//        System.out.println("All Students:");
//        for (Student st : studentDao.getAll()) {
//            System.out.println(st);
//        }
    	
    	
//    	Student updatedStudent = new Student(222, "sonu", "cse");
//        studentDao.update(updatedStudent);
//        System.out.println("Student updated.");
    	
    	studentDao.delete(222);
        System.out.println("Deleted student");
        
        
        
        
    	
    }
}
