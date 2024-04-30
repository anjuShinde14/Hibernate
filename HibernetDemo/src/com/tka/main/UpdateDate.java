package com.tka.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class UpdateDate {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Song.class); 

	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	//data coming from FrontEnd
	
	int id=3;
	String artistname="salman khan";
	session.beginTransaction();
	
	//get particular record by id from database
	Song s=(Song)session.get(Song.class, id);
	//System.out.println(s);
	
	s.setArtist(artistname);
	//session.update(s);
	
	session.merge(s);
	
	session.getTransaction().commit();
	
	System.out.println("Rcord is Updated....");
}
}
