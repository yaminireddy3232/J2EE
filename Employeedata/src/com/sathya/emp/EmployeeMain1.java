package com.sathya.emp;

import java.util.List;



public class EmployeeMain1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDao();
		int createResult=dao.createEmployeetable();
		System.out.println("Table creation status............"+createResult);
		
	}
}
class EmployeeMain2{
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		Employee employee1=new Employee();
		employee1.setEmpId("DEV203");
		employee1.setEmpName("yamini");
		employee1.setEmpSalary(40000);
        int result=dao.saveEmployee(employee1);
		if(result==1) {
			System.out.println("Data inserted successfully...."+result);
		}
		else
		{
			System.out.println(" Data insertion fail check once....."+result);
		}
	}
    }
class EmployeeMain3{
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		Employee employee2=new Employee();
		employee2.setEmpId("MAN209");
		employee2.setEmpName("yamini reddy");
		employee2.setEmpSalary(70000);
        int result=dao.saveEmployee(employee2);
		if(result==1) {
			System.out.println("Data inserted successfully...."+result);
		}
		else
		{
			System.out.println(" Data insertion fail check once....."+result);
		}
	}
    }
class EmployeeMain4{
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		Employee employee3=new Employee();
		employee3.setEmpId("EM450");
		employee3.setEmpName("sunny");
		employee3.setEmpSalary(50000);
        int result=dao.saveEmployee(employee3);
		if(result==1) {
			System.out.println("Data inserted successfully...."+result);
		}
		else
		{
			System.out.println(" Data insertion fail check once....."+result);
		}
	}
    }

class EmployeeMain5{
	 public static void main(String[]args) {
		 EmployeeDao dao=new EmployeeDao();
		 Employee employee=dao.findById("DEV203");
	    if(employee!=null) {
	   System.out.println("employee available..");
	   System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());
	  }
	  else {
	   System.out.println(" employee not available...");
	  }
	 
	 }
	}
class EmployeeMain6 {
	public static void main(String[] args) { 
		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees = dao.findAll();
		employees.forEach(employee->System.out.println(employees));
	}
}
class EmployeeMain7{
	public static void main(String[] args) { 
		EmployeeDao dao = new EmployeeDao();
		int count = dao.updateEmployee(40000, 1000);
		System.out.println("updated records count.."+count);
	}
}
class EmployeeMain8 {
	public static void main(String[] args) { 
		EmployeeDao dao = new EmployeeDao();
		int count = dao.deleteEmployeeById("DEV203");
		System.out.println("delete records count.."+count);
	}
}
class EmployeeMain9 {
	public static void main(String[] args) { 
		EmployeeDao dao = new EmployeeDao();
		int count = dao.deleteEmployeeBySalary(80000);
		System.out.println("delete records count.."+count);
	}
}
class EmployeeMain10 {
	public static void main(String[] args) { 
		EmployeeDao dao = new EmployeeDao();
		int count = dao.droptable();
		System.out.println("Table is dropped status...."+count);
	}
}








