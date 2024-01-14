package javafeature;

import java.util.List;
import java.util.Map;

public class SMap {

	public static void main(String[] args) {

		List<Integer> l  = List.of(1,2,3,4,5,6);
		List<String> s = List.of("Nilya" ,"Sham" ,"Kush" ,"suraj" ,"Priya");
		
        System.out.println("\n Value greater than 2 ");
		l.stream().filter(a -> a >2).forEach(System.out::println);
		
		System.out.println("\n Concating the name ");
		s.stream().map(e -> e +" " +"Kulkarni").forEach(System.out::println);
		
		System.out.println("\n Character at 0th position");
		s.stream().map(e -> e.charAt(0)).forEach(System.out::println);
		
		System.out.println(" Upper case");
		s.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
	}

}
