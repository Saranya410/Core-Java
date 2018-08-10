package com.deloitte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e1=new Emp(28,"PADHU",151);
Emp e2=new Emp(29,"subhi",161);
Emp e3=new Emp(28,"MADHU",171);
ArrayList empList=new ArrayList();
empList.add(e1);
empList.add(e2);
empList.add(e3);
ApplicationContext context=new ClassPathXmlApplicationContext("BeansSpringJDBC.xml");
EmpDAO eDao=(EmpDAO)context.getBean("eDao");
//eDao.insertMulRow(empList);
//eDao.UpdateRow(e2);
//eDao.deleteRow(e1);
List<Emp> allEmp=eDao.readAllEmp();
Iterator<Emp> it=allEmp.iterator();
while(it.hasNext())
{
	Emp e=it.next();
	System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDeptId());
	
}
	}

}
