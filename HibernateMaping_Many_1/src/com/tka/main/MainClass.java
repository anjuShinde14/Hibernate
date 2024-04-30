package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop1;
import com.tka.entity.Student1;

public class MainClass {
 public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Laptop1.class);
	config.addAnnotatedClass(Student1.class);
	
	SessionFactory factory=config.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	Laptop1 l=new Laptop1("Dell");
	Laptop1 l1=new Laptop1("Accer");
	Laptop1 l2=new Laptop1("Hp");
	
	session.persist(l);
	session.persist(l1);
	session.persist(l2);
	
	Laptop1 lapi=(Laptop1)session.get(Laptop1.class, 1);
	System.out.println(lapi);
	Student1 s1=new Student1();
	s1.setName("Anjali");
	s1.setEmailid("anjali@gmail.com");
	s1.setLaptop(lapi);
	
	session.persist(s1);
	
	Student1 stud=(Student1)session.get(Student1.class, 2);
	
	
	System.out.println(stud);
	
	session.getTransaction().commit();
	session.close();
}
}
