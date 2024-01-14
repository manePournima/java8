package javafeature;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		System.out.println("Converting int Array into Stream ");
		
		Arrays.stream(a).filter(e -> e >3).forEach(System.out::println);
		
		String [] b= {"Raj" ,"Arnav" ,"Vinay" , "Dnyan", "Anaya"};
		System.out.println("String Array");
		
		Stream <String> st= Arrays.stream(b);
		st.forEach(str -> System.out.print(str + " "));
		System.out.println("\n");

		System.out.println("Sum -"+ Arrays.stream(a).sum()+"\n");
		
		System.out.println("Count -"+ Arrays.stream(a).count()+"\n");
		System.out.println("hashCode value -"+ Arrays.stream(a).hashCode()+"\n");
		System.out.println("Average -"+ Arrays.stream(a).average()+"\n");
		System.out.println("Max value -"+ Arrays.stream(a).max()+"\n");
		System.out.println("Min value -"+ Arrays.stream(a).min()+"\n");




		
		
	
		

	}

}
