package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.dao.AbstractDao;
import com.myapp.model.Address;
import com.myapp.model.Student;
import com.myapp.service.StudentService;

public class OneToOneMapping  extends AbstractDao
{
    public static void main( String[] args )
    {
        System.out.println( "Code execution started!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentService service = (StudentService) context.getBean("studentService");
        
        Address address1 = new Address("SB Road", "Pune", "MH", "600097");
		Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
		Student student1 = new Student("Monica", address1);
		Student student2 = new Student("Joe", address2);
        
        service.saveStudent(student1);
        service.saveStudent(student2);
        System.out.println( "Code executed successfully!" );
    }
}
