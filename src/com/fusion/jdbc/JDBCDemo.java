package com.fusion.jdbc;

public class JDBCDemo {

	public static void main(String[] args) throws Exception{

	Class.forName("com.fusion.jdbc.Abc").newInstance();  // it loads the class
	}

}

class Abc
{
	static
	{
		System.out.println("In static block");
	}
	
	
	{
		System.out.println("Instance block");
	}
}
