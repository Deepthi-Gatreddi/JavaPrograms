package com.java.innerclass;

public class OuterClass {   //Non static inner class example
	private int salary=40000;
	void request() {
		System.out.println("Your salary is: "+salary);
	}
	public class InnerClass{
		void request() {
			System.out.println("Yours salary is: "+salary);
		}
	}
	public static void main(String args[]) {
		OuterClass employee1=new OuterClass();
		OuterClass.InnerClass deepthi=employee1.new InnerClass();
		employee1.request();
		deepthi.request();
	}
}
