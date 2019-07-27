package com.hbrn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}	



	//	
	//	
	//	private static SessionFactory sessionFactory;
	//
	//	private SessionFactory buildSessionFactory() {
	//
	//		Configuration configuration = new Configuration();
	//		configuration.configure("hibernate.cfg.xml");
	//		System.out.println("Hibernate Annotation Configuration loaded");
	//
	//		SessionFactory sessionFactory  = configuration.buildSessionFactory();
	//
	//		return sessionFactory;
	//	}   
	//
	//	public SessionFactory getSessionFactory() {
	//		if(sessionFactory == null) sessionFactory = buildSessionFactory();
	//		return sessionFactory;
	//	}
}
