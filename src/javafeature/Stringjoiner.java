package javafeature;

import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(" Ambani," ," "," Ambani");
		s.add("Mukesh");
		s.add("Nita");
		s.add("Akash");
		s.add("Anant");
		System.out.println(s+"\n");
		
		StringJoiner s1= new StringJoiner(", ", "{", "}");
		s1.add("Priya");
		s1.add("Vandana");
		s1.add("Pournima");
		s1.add("Rutuja");
		System.out.println(s1 +"\n");
		
		// merging s and s1 string
        s1.merge(s);
        System.out.println(s1);
        


	}

}
