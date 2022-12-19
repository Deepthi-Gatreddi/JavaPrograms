package com.java.innerclass;


public class StaticInnerClass {
	static int salary=40000;
	static class InnerClass{
		void request() {
			System.out.println("Yours salary is: "+salary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass.InnerClass deepthi=new InnerClass(); 
		deepthi.request();
	}

}
