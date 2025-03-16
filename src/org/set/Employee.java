package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Employee {
public static void main(String[] args) {
	Set r=new HashSet();
	r.add(10);
	r.add("java");
	r.add(55);
	r.add(34.234f);
	r.add('m');
	r.add(500);
	r.add(10);
	r.add(null);
	System.out.println(r);
	
	
	Set r1=new LinkedHashSet();
	r1.add(10);
	r1.add("java");
	r1.add(55);
	r1.add(34.234f);
	r1.add('m');
	r1.add(500);
	r1.add(10);
	r1.add(null);
	System.out.println(r1);
	Set<Integer> r2=new TreeSet();
	r2.add(10);
	r2.add(3);
	r2.add(30);
	r2.add(400);
	r2.add(35);
	System.out.println(r2);
	//size
	int size = r.size();
	System.out.println(size);
	boolean contains = r.contains(null);
	System.out.println(contains);

	System.out.println("singapore");
	System.out.println("Tentronic company");
	
	System.out.println("hiiiiiii");
	System.out.println("How are you");

	
}
}
