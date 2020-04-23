package com.reports;

public class Ef 
{
	public static void m3()
	{
		System.out.println("hello");
	}
	public static void m1() 
	{
		System.out.println("This is m1 method");
	}

	public static void m5()
	{
		System.out.println("m5 method");
	}
	

	public static void m4()
	{
		//only 30% coding of m4() is completed 
		//but TL wants to merge branches.. but dev1's work of m4 not completed 100%
		//So, save it temporary and later dev1 can reuse m4 method
		//so, go for 'stagging'
		//--------------------------------------------
		//now its completed
	}

	public static void main(String[] args) 
	{
		Ef e=new Ef();
		e.m3();
		
	}

}
