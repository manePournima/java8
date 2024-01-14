package javafeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		/*List< Integer> l = Arrays.asList(1,2,3,4,5);
		List<Integer> squ = l.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Square"+squ);
		
		List<Integer> add = l.stream().map(e ->e+e).collect(Collectors.toList());
		System.out.println("Addition"+add);*/
	//==============================	
		//map
		/*List<Person> p = Arrays.asList(new Person("RM", 29), new Person("Suga", 30),
				new Person("Jhope", 30),new Person("Jimin", 29),
				new Person("V", 28), new Person("Jin", 31));
		List<String> p1 = p.stream().map(i ->i.getName()).collect(Collectors.toList());
		System.out.println(p1);
		
		List<Integer> s = p.stream().map(j -> j.getAge()).collect(Collectors.toList());
		System.out.println(s);*/
		
		List<String > name = Arrays.asList("Jin" , "Jimin", "Kim" , "Jhope","Suga","JK","RM");
		List<String> k =  name.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
		System.out.println(k);
 	}

}

/*class Person 
{
	private String name ;
	private int age ;
	
	public Person(String name , int age ) 
	{
		this.name = name;
		this.age= age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}*/
