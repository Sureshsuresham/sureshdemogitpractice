package com.basicjava;

public class ReverseStringsample {

	//private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Str="JavaTpoint";
String Reverse="";
char ch;
for(int i=0;i<Str.length();i++)
{
	//Reverse=Reverse+Str.charAt(i);
	//ch=Str.CharAt(i);
	ch=Str.charAt(i);
	Reverse=ch+Reverse;
}
System.out.println("Reverse string"+Reverse);
}

}



