package com.tka.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class InsertDate {
 
public static void main(String[] args) {
	
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Song.class);
	
	SessionFactory factory=config.buildSessionFactory();
	
	Session session=factory.openSession();
	
	Song s=new Song();
	s.setName("dil diya galla");
	s.setArtist("Salman khan");
	
	session.beginTransaction();
	session.persist(s);  //use to save
	//session.save(s);
	session.getTransaction().commit();
	session.close();
}
}
