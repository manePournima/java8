package javafeature;

public class DeepCopy {

	public static void main(String[] args) {

		Java obj = new Java();
		obj.i = 222;
		obj.j = 999;

		// changes in one entity are not reflected in the other entities

		Java obj1 = new Java();
		obj1.i = obj.i;
		obj1.j = obj.j;

		obj1.j = 555;

		System.out.println("Deep Copy");
		System.out.println(obj);
		System.out.println(obj1);

	}

}

class Java {
	int i;
	int j;

	@Override
	public String toString() {
		return "Java [i=" + i + ", j=" + j + "]";
	}

}