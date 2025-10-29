package com.hbn.employee.configuration;

import java.util.Properties;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class Hibernateconfiguration {
	public static SessionFactory getSessionFactory() {
		Properties prop=new Properties();
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		prop.put(Environment.JAKARTA_JDBC_URL,"jdbc:mysql://localhost:3306/bhanu");
		prop.put(Environment.JAKARTA_JDBC_USER, "root");
		prop.put(Environment.JAKARTA_JDBC_PASSWORD, "souvik@7602");
		prop.put(Environment.HBM2DDL_AUTO, "create");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.FORMAT_SQL, "true");
		
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().applySettings(prop).build();
//		Metadata meta=new MetadataSources(ssr).addAnnotatedClass(com.hbn.employee.entity.Employee.class).buildMetadata();
//		SessionFactory sessionFactory=meta.buildSessionFactory();

		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(prop).build())
				.addAnnotatedClass(com.hbn.employee.entity.Employee.class).buildMetadata().buildSessionFactory();
	}

}
