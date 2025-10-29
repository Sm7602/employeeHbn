package com.hbn.employee;


import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee("vin","male",98000);
		
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory=meta.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		
//		SessionFactory sessionFactory= Hibernateconfiguration.getSessionFactory();
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		System.out.println("done.............");
	}

}
