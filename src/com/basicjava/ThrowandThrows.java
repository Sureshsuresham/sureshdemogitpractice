package com.basicjava;

public class ThrowandThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int age=15;
		if (age<=18)
		{
		
			throw new Exception("Person Not eligible for Voter id");
			
		}
		
		
		
		
		else
		
				System.out.println("Person eligible for voter id");
	}

}

