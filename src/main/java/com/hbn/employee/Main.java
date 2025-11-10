package com.hbn.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Address;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp1=new Employee("kalu","male",25416);
		Employee emp2=new Employee("lalu","male",25416);
		Employee emp3=new Employee("valu","male",25416);
		Employee emp4=new Employee("aalu","male",25416);
		Address add1=new Address("Gn","up");
		Address add2=new Address("n","up");
		Address add3=new Address("m","up");
		Address add4=new Address("l","up");
		
		emp1.setAddresses(List.of(add1,add2,add3,add4));
		emp2.setAddresses(List.of(add1,add2,add3));
		emp3.setAddresses(List.of(add1,add2,add4));
		emp4.setAddresses(List.of(add1,add3,add4));
		
		add1.setEmployeees(List.of(emp1,emp2,emp3,emp4));
		add2.setEmployeees(List.of(emp1,emp3,emp4));
		add3.setEmployeees(List.of(emp1,emp2,emp4));
		add4.setEmployeees(List.of(emp1,emp2,emp3));
		
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
//
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		
//		tx.commit();
		
		session.load(emp1, 1);
		System.out.println(emp1);
		System.out.println(emp1.getAddresses());
		
		
//		session.load(add1, 1);
//		System.out.println(add1);
//		System.out.println(add1.getEmployee());
//		
		
		System.out.println("woh! hibernate sikh liya.............");
	}

}
