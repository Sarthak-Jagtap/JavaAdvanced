package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HBUtil {

	
	static SessionFactory sessionFactory;
	static StandardServiceRegistry registry;
	
	static SessionFactory getSessionFactory() {
		registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		
		sessionFactory = new MetadataSources()
				.buildMetadata(registry)
				.buildSessionFactory();
		
		return sessionFactory;
	}
}
