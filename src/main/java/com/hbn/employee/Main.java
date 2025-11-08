package com.hbn.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Address;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee("kalu","male",25416);
		Address add1=new Address("Gn","up");
		Address add2=new Address("n","up");
		Address add3=new Address("m","up");
		Address add4=new Address("l","up");
		
		add1.setEmployee(emp);
		add2.setEmployee(emp);
		add3.setEmployee(emp);
		add4.setEmployee(emp);
		
		emp.setAddresses(List.of(add1,add2,add3,add4));
		
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
		session.persist(emp);
		tx.commit();
		
//		session.load(emp, 1);
//		System.out.println(emp);
//		System.out.println(emp.getAddresses());
////		
		
//		session.load(add1, 1);
//		System.out.println(add1);
//		System.out.println(add1.getEmployee());
//		
		
		System.out.println("woh! hibernate sikh liya.............");
	}

}
