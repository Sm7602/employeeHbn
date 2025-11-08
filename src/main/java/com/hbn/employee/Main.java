package com.hbn.employee;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Address;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee("kalu","male",25416);
		Address add=new Address("Gn","up");
		
		emp.setAddress(add);
		add.setEmployee(emp);
		
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		
		session.persist(emp);
		tx.commit();
//		
		
//		
//		session.load(emp, 1);
//		System.out.println(emp);
//		System.out.println(emp.getAddress());
//		
//		
//		session.load(add, 2);
//		System.out.println(add);
//		System.out.println(add.getEmployee());
//		
		
		System.out.println("woh! hibernate sikh liya.............");
	}

}
