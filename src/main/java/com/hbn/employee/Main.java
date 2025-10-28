package com.hbn.employee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee(201,"vinoy","male",98000);
		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		System.out.println("done.............");
	}

}
