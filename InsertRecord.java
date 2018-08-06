package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration config=new Configuration();
config.configure("hibernate.cfg.xml");
SessionFactory sf=config.buildSessionFactory();
Session session=sf.openSession();
Laptop lt=new Laptop();
lt.lid=28;
lt.brand="LENOVA";
lt.price=19465.58;
Transaction tx=session.beginTransaction();
tx.begin();
session.save(lt);
tx.commit();
System.out.println("Successfully inserted 1 row");
	}

}
