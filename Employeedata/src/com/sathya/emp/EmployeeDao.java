package com.sathya.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class EmployeeDao {


	public int createEmployeetable()
	{
		Connection connection=null;
		Statement statement=null;
		int result=0;
		try {
		connection=DataBaseConnectionUtils.createConnection();
		statement=  connection.createStatement();
		String query="create table employee_info (empId varchar2(30) primary key,empName varchar2(20),empSalary number)";
		result=statement.executeUpdate(query);
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try { if(connection!=null)connection.close();
			      if(statement!=null)statement.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			}
	
		return result;
	}


public int saveEmployee(Employee e)
{
	int result=0;
	try(Connection connection=DataBaseConnectionUtils.createConnection())
	{
		//create the ps object with params
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee_info values(?,?,?)");
		//set the date to params
		preparedStatement.setString(1, e.getEmpId());
		preparedStatement.setString(2, e.getEmpName());
		preparedStatement.setDouble(3, e.getEmpSalary());
		//execute the query
		result=preparedStatement.executeUpdate();
	}
	catch (Exception e2) {
		e2.printStackTrace();
	}
	return result;
}

public Employee findById(String EmpId) {
	  
	  Employee e=null;
	    try(Connection connection = DataBaseConnectionUtils.createConnection()){
	 
	    PreparedStatement preparedStatement = connection.prepareStatement("select * from employee_info where empId=?");
	    //set the data to params
	    preparedStatement.setString(1, EmpId);
	    //execute the query
	     ResultSet resultSet=preparedStatement.executeQuery();
	     if(resultSet.next()) {
	      //read the data and setting data to employee object
	      e= new Employee();
	      e.setEmpId(resultSet.getString(1));
	      e.setEmpName(resultSet.getString(2));
	      e.setEmpSalary(resultSet.getDouble(3));
	    }
	    }
	    catch (SQLException e1) {
	   
	   e1.printStackTrace();
	  }
	  return e;
	    
}

public List<Employee> findAll()
{	List<Employee> employees = new ArrayList<Employee>();
	Employee e = null;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{
		Statement statement = connection.createStatement();
		ResultSet resultSet =  statement.executeQuery("select * from employee_info");
		
		while(resultSet.next())
		{	//read the data from ResultSet & setting to employee
			e = new Employee();
			e.setEmpId(resultSet.getString(1));
			e.setEmpName(resultSet.getString(2));
			e.setEmpSalary(resultSet.getDouble(3));
			
			//adding the employee into List.
		     employees.add(e);
	}
	}
	catch (SQLException e3) {
		e3.printStackTrace();
	}
	return employees;
}

public int updateEmployee(double salary,double incValue)
{	int result = 0;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement("update employee_info set empSalary=empSalary+? where empSalary>?");
		//set the data to params 
		preparedStatement.setDouble(1, incValue);
		preparedStatement.setDouble(2, salary);
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
}

public int deleteEmployeeById(String empId)
{	int result = 0;
try(Connection connection = DataBaseConnectionUtils.createConnection())
{	//create the PS object
PreparedStatement preparedStatement = connection.prepareStatement("delete from employee_info  where empId=?");
//set the data to params 
preparedStatement.setString(1,empId );

//execute the query 
result =  preparedStatement.executeUpdate();
}
catch(SQLException e)
{	e.printStackTrace();
}
return result;
}



public int deleteEmployeeBySalary(double salary)
{	int result = 0;
try(Connection connection = DataBaseConnectionUtils.createConnection())
{	//create the PS object
PreparedStatement preparedStatement = connection.prepareStatement("delete from employee_info where empSalary>?");
		
  //set the data to params 
  preparedStatement.setDouble(1,80000);
  //execute the query 
 result =  preparedStatement.executeUpdate();
}
catch(SQLException e)
{	e.printStackTrace();
}
return result;
}


public int droptable()
{	int result=0;
try(Connection connection=DataBaseConnectionUtils.createConnection())
{
	//create the statement object
	Statement statement = connection.createStatement();
	//execute the query
	result = statement.executeUpdate("drop table employee_info");
}
catch(SQLException e)
{	e.printStackTrace();
}
return result;
}
}






