package com.study;

public class Employee11 
{
		String name;
		int age;
		double salary;
		
		void employee_details(String name, int age, double salary)
		{
			this.name=name;
			this.age=age;
			this.salary=salary;
		
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Salary:"+salary);
		}
	public static void main(String[] args) {
		Employee11 emp=new Employee11();
		emp.employee_details("Madhuri", 28, 200000); //local variable
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);// global variable accessing take deafult value
	}

}

