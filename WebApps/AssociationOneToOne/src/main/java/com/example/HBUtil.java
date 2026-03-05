package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HBUtil {
	static SessionFactory sessionFactory;
	static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory() {
		registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		
		sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
		
		return sessionFactory;
	}
}
