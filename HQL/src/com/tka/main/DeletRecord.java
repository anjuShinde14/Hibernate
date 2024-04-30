package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.tka.entity.Song;

public class DeletRecord {
public static void main(String[] args) {
	
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Song.class);
	
	SessionFactory factory=config.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	int id=5;
	
	String hqlQuery="delete Song where id=:myid";
	
	MutationQuery query=session.createMutationQuery(hqlQuery);
	query.setParameter("myid", id);
	
	query.executeUpdate();
	session.getTransaction().commit();
	
	session.close();
	System.out.println("Delete Successfully");
}
}
