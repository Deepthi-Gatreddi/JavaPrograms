package com.java.innerclass;

public class LocalInnerClass {
	private int salary=40000;
	void request() {
	   class InnerClass{
		void message() {
			System.out.println("Yours salary is: "+salary);
		}
	   }
		InnerClass obj=new InnerClass();
		obj.message();
	}
	public static void main(String args[]) {
		LocalInnerClass employee1=new LocalInnerClass();
		employee1.request();
		
	}

}

