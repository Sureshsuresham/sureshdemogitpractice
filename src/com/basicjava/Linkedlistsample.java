package com.basicjava;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linkedlistsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>al=new LinkedList<String>();
al.add("Praveen");
al.add("Vijay");
al.add("Suresh");
al.add("Muni");
al.add("Kiran");

ListIterator<String> itr=(ListIterator<String>) al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

	}

}
