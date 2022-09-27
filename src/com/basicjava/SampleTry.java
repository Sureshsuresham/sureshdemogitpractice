package com.basicjava;

public class SampleTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int data=50/0;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		//System.out.println("rest of the code");
		
		finally	{
			System.out.println("finally block always excute");
		}
		
	}
	
}



