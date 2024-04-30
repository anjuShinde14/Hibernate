package com.tka.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.tka.entity.Song;

public class DeleteData {
public static void main(String[] args) {
	 
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Song.class);
	
	int id=2;
	SessionFactory factory=config.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	Song s= (Song) session.get(Song.class,id);
	//session.delete(s);
	session.remove(s);
	session.getTransaction().commit();
	System.out.println("Record is deleted.......");
}
}
