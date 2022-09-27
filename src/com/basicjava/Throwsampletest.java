package com.basicjava;

public class Throwsampletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=15;
if(age<=18)
{
	throw new Exception("person not eligible for voter id");
}
else
{
	System.out.println("person eligible for voter id");
}

}
