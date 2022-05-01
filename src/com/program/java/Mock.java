package com.program.java;

public class Mock {
	public void m1(Object a) 
	{
		System.out.println("int - arguments");
	}
	public void m1(String a) 
	{
		System.out.println("int111 - arguments");
	}
	public static void main(String[] args) {
	
		Mock t= new Mock();
		t.m1(null);
	
	}

}
