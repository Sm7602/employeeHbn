package com.hbn.employee;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.employee.configuration.Hibernateconfiguration;
import com.hbn.employee.entity.Employee;

public class Main {
	public static void main(String[] arg) {
		Employee emp=new Employee();
		
		Session session =Hibernateconfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		//for get all record
//        Query query=session.createQuery("from empp",Employee.class);
//        System.out.println(query.list());
		
		//HQL to get records with pagination
//		query.setFirstResult(1);
//		query.setMaxResults(5);
//		System.out.println(query.list());
        
//      Query q=session.createQuery("update empp set name=:n where id=:i");  
//		q.setParameter("n","Pankaj");  
//		q.setParameter("i",1);  
//		System.out.println("status: "+q.executeUpdate());  
		
//		HQL delete query
		MutationQuery query=session.createMutationQuery("delete from empp where id = 1");  
		query.executeUpdate();  
		
		
		System.out.println("done.............");
	}

}
