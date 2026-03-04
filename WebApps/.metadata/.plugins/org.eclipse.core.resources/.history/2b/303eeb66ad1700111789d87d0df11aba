package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDao {

	public Employee getById(int id) {
		try (Session session = HBUtil.getSessionFactory().openSession()) {

			Query<Employee> qry = session.createQuery("from Employee e where id= :id", Employee.class);
			qry.setParameter("id", id);

			return qry.uniqueResult();

			// return qry.getSingleResult();
		}
	}

	public List<Employee> getAll() {
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			Query<Employee> qry = session.createQuery("from Employee", Employee.class);
			return qry.getResultList();
		}
	}

	public void addEmployee(Employee emp) {
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			Transaction tr = session.beginTransaction();
			session.persist(emp);
			tr.commit();
		}
	}

	public void getEmployeeAnalytics() {
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			Query<Object[]> query = session.createNamedQuery("employee.analytics", Object[].class);

			List<Object[]> list = query.getResultList();

			for (Object[] row : list) {
				System.out.print("name : " + row[0] + " ");
				System.out.print("avg : " + row[1] + " ");
				System.out.print("max : " + row[2] + " ");
				System.out.println("min : " + row[3] + " ");
			}
		}
	}

	public List<Employee> getEmployeeBySal() {
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			Query<Employee> query = session.createQuery("from Employee e where e.salary > 50000", Employee.class);
			return query.getResultList();
		}
	}
	
	public List<Object[]> getNameAndSal(){
		try(Session session = HBUtil.getSessionFactory().openSession()){
			Query<Object[]> query = session.createNamedQuery("employee.nameAndSal",Object[].class);
			
			List<Object[]> list = query.getResultList();
			
			for (Object[] row : list) {
				System.out.print("name : " + row[0] + " ");
				System.out.println("sal : " + row[1] + " ");
			}
			
			
			return list;
		}
	}
	
	public List<Employee> getEmployeesByPage(int pageNumber, int pageSize) {

	    try (Session session = HBUtil.getSessionFactory().openSession()) {

	        Query<Employee> query = session.createQuery("from Employee", Employee.class);

	        int startIndex = (pageNumber - 1) * pageSize;

	        query.setFirstResult(startIndex);
	        query.setMaxResults(pageSize);

	        return query.getResultList();
	    }
	}
	
	
}
