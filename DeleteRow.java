package com.deloitte;
import java.util.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
public class DeleteRow {

	public static void main(String args[])
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from com.deloitte.Laptop");
		List listObj=query.list();
		Iterator it=listObj.iterator();
		while(it.hasNext())
		{
			Laptop lt1=(Laptop)it.next();
			System.out.println(lt1.getBrand()+" "+lt1.getLid()+" "+lt1.getPrice());

		}
//		Transaction tx=session.beginTransaction();
//		tx.begin();
//		Laptop lt1=(Laptop)session.get(Laptop.class,26);
//		session.delete(lt1);
//		tx.commit();
//		System.out.println("Succesfully deleted");
		
	}
}
