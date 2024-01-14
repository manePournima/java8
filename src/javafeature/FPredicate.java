package javafeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class FPredicate {

	/* Functional interface
	 * 1. predicate interface- gives output in boolean form i.e true/false
	 * 2.Consumer- only take input..modifies data no output
	 * 2.Functional interface- gives output depend on input 
	 */
	
	public static void main(String[] args) {
		Predicate<String> cl =  str -> str.length()<5;
		System.out.println(cl.test("TocheckLenghth")); // it gives only bollean value
		
		//1st- input 2nd- output
		Function<Integer,String> getInt = t -> t*10 +" multiply by 10";
		System.out.println(getInt.apply(3)); // it give any value depends upon input
		

	}

}
