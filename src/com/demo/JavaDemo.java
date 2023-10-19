package com.demo;

public class JavaDemo {
	public void votingEligibility(int age) {
		if(age>=18) {
		System.out.println("Eligible");
	}
		else {
			System.out.println("Not eligible");
		}
	}
	public static void main(String[] args) {
		JavaDemo m=new JavaDemo();
		//input=10
		m.votingEligibility(10);
	}
}
