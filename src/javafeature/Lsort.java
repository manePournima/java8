package javafeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lsort {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Pournima");
		Student s2 = new Student(22, "Vaishnavi");
		Student s3 = new Student(88, "Shubham");
		Student s4 = new Student(11, "Swapnil");
		
		List<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);

		//System.out.println(li);
		Collections.sort(li,(a,b)->b.id - a.id);
		System.out.println(li);
	}

}

class Student
{
	public int id;
	public String name;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}