package org.methodoverloading;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) {
       System.out.println(id+name);
	}
	public void getStudentInfo(int pn, char mail) {
		System.out.println(pn+mail);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(6067);
		obj.getStudentInfo(06067, "akila");
		obj.getStudentInfo(98,'m');
	}
}


/*
  Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/