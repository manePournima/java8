package javafeature;

import java.util.Arrays;
import java.util.List;

public class Method {
	public static void method(String string)

	{
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		Method m = new Method();
		List<String> empl = Arrays.asList("Mane","Pournima");
				empl.forEach(Method::method);
	}

}
