package com.example;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HBUtil {

	static SessionFactory sessionFactory;
	static StandardServiceRegistry registry;

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();

		Properties map = new Properties();

		map.put("jakarta.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
		map.put("jakarta.persistence.jdbc.url", "jdbc:mysql://localhost:3306/EmployeeDB");
		map.put("jakarta.persistence.jdbc.user", "root");
		map.put("jakarta.persistence.jdbc.password", "#Sarthak@76342");

		map.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		map.put("hibernate.hbm2ddl.auto", "update");
		map.put("hibernate.show_sql", "true");
		map.put("hibernate.format_sql", "true");

		cfg.addProperties(map);

		registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		sessionFactory = new MetadataSources(registry)
				.addAnnotatedClass(Employee.class)
				.buildMetadata()
				.buildSessionFactory();

		return sessionFactory;
	}
}