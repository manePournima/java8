package javafeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceStream {
	public static void main(String[] args) {
	/*List< String> l = Arrays.asList("Ram", "Ravan", " Lakshman", "Sita");
	List<String> result = l.stream().sorted().collect(Collectors.toList());
	System.out.print(result);*/
		List< Integer> l = Arrays.asList(1,2,3,4,5);
	 int sum = l.stream().reduce(0,(a,b)-> a+b);
	 System.out.println(sum);
 }
}
