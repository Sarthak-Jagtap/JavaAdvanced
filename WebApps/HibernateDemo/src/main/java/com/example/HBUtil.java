package com.example;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.SessionFactory;

public class HBUtil {

	static StandardServiceRegistry registry;
	static org.hibernate.SessionFactory sessionFactory;
	
	static SessionFactory getSessionFactory(){
		registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		
		sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
		
		return sessionFactory;
	}
}
