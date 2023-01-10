package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("student name is jason");
	}
	
	public void studentDept() {
		System.out.println("student dept is EEE");
	}
	
	public void studentId() {
		System.out.println("student ID is 6067");
	}

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeBank();
		obj.deptname();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
