package com.deloitte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import oracle.net.aso.e;

public class EmpDAO {
    JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    public void insertRow(Emp e)
    {
    	int eid=e.getEmpId();
    	String ename=e.getEmpName();
    	int did=e.getDeptId();
    	String sql="INSERT INTO EMP28 VALUES("+eid+",'"+ename+"',"+did+")";
    	int rows=jdbcTemplate.update(sql);
    	if(rows>0)
    	{
    		System.out.println("SUCCESSFULLY INSERTED");
    	}
    	else
    	{
    		System.out.println("NOT INSERTED,TRY AGAIN");
    	}
    }
	public void insertMulRow(ArrayList empList)
	{
		Iterator it=empList.iterator();
		while(it.hasNext())
		{
			Emp e=(Emp)it.next();
			int eid=e.getEmpId();
	    	String ename=e.getEmpName();
	    	int did=e.getDeptId();
	    	String sql="INSERT INTO EMP28 VALUES("+eid+",'"+ename+"',"+did+")";
	    	int rows=jdbcTemplate.update(sql);
	    	if(rows>0)
	    	{
	    		System.out.println("SUCCESSFULLY INSERTED "+ename);
	    	}
	    	else
	    	{
	    		System.out.println("NOT INSERTED,"+ename +"TRY AGAIN");
	    	}
	    }
			
		}
	
    public void deleteRow(Emp e)
    {
    	int eid=e.getEmpId();
    	String ename=e.getEmpName();
    	int did=e.getDeptId();
    	String sql="DELETE FROM EMP28 WHERE EMPNAME='"+ename+"'";
    	int rows=jdbcTemplate.update(sql);
    	if(rows>0)
    	{
    		System.out.println("SUCCESSFULLY DELETED");
    	}
    	else
    	{
    		System.out.println("NOT DELETED,TRY AGAIN");
    	}
    	
    }
    public void UpdateRow(Emp e)
    {
    	int eid=e.getEmpId();
    	String ename=e.getEmpName();
    	int did=e.getDeptId();
    	String sql="update emp28 set empname='"+ename+"' where empname='jagan'";
    	int rows=jdbcTemplate.update(sql);
    	if(rows>0)
    	{
    		System.out.println("SUCCESSFULLY UPDATED"+ename);
    	}
    	else
    	{
    		System.out.println("NOT UPDATED,TRY AGAIN");
    	}
    }
    public List<Emp> readAllEmp()
    {
    	List<Emp> allEmp;
    	String sql="select * from emp28";
    	allEmp=jdbcTemplate.query(sql, new RowMapper()
    	{

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				int did=rs.getInt(3);
				Emp e=new Emp();
				e.setEmpId(eid);
				e.setEmpName(ename);
				e.setDeptId(did);
				return e;
			}
    
    	});
    	return allEmp;
    }
}

