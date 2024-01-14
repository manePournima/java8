package javafeature;

import java.util.*;
import java.util.stream.Collectors;


public class Stream {

	public static void main(String[] args) {
		List <String> l = List.of("Shailu", "Payal", "Priyanka" , "Nandini", "Parajakta" ,"Shanu");
		List<String> l2 = l.stream().filter(e -> e.startsWith("P")&& e.endsWith("a"))
		.collect(Collectors.toList());
		System.out.println("For List");
		System.out.println(l2);
		
		Set <String>s = l.stream().filter(e -> e .startsWith("S") && e.endsWith("u")).
		collect(Collectors.toSet());
		System.out.println("For Set");
		System.out.println(s);

		


		
	}

}
