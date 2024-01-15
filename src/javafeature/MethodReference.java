package javafeature;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void print(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		MethodReference mr = new MethodReference();
		List<String>student = Arrays.asList("ppp","sss","vvv","ggg");
		student.forEach(MethodReference::print);
 				}

}
