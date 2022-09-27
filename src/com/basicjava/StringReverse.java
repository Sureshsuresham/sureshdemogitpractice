package com.basicjava;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Reverse string
		String name="sURESH";
		String reverse="";
		char ch;
		for (int i=0;i<name.length();i++);
		{
		ch=name.charAt(i);
		reverse=ch+reverse;
		}
		System.out.println("reverse word is:"reverse);
		
	}

}
