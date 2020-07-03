package com.wipro.wrapperclass;

public class Ex4 {
	public static void main(String[] args) {
		Employee emp = new Employee("Bob Biswas");
		Employee empClone = emp.clone();
		
		empClone.setName("John Doe");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
	


