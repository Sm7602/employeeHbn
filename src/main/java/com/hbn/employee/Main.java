package com.hbn.employee;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Address;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee("vinay","male",25416);
		Address add=new Address("GZb","up");
		
		emp.setAddress(add);
//		add.setEmployee(emp);
		
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		session.persist(emp);
//		session.persist(add);
//		tx.commit();
		
		
		
//		session.load(emp, 1);
//		System.out.println(emp);
//		
		session.load(add, 1);
		System.out.println(add);
		
		
		System.out.println("done.............");
	}

}
