package com.java.innerclass;

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj=new AbstractClass() {

			@Override
			void salary() {
				System.out.println("your Salary is: 80000");
				
			}
			
		};
		obj.salary();
		AbstractClass.AbstractInner obj2=obj.new AbstractInner() {

			@Override
			void bonus() {
				System.out.println("your bonus is: 10000");
				
			}
			
		};
		obj2.bonus();
	}
}


