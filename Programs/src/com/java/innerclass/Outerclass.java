package com.java.innerclass;

public class Outerclass {
	private int salary=40000;
	void request() {
		System.out.println("Your salary is: "+salary);
	}
	public class Innerclass{
		void request() {
			System.out.println("Yours salary is: "+salary);
		}
	}
	public static void main(String args[]) {
		Outerclass employee1=new Outerclass();
		Outerclass.Innerclass deepthi=employee1.new Innerclass();
		employee1.request();
		deepthi.request();
	}

}
