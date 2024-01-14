package javafeature;

public class DeepCopy {

	public static void main(String[] args) {

		BCA obj = new BCA();
		obj.i = 222;
		obj.j = 999;

		// changes in one entity are not reflected in the other entities

		BCA obj1 = new BCA();
		obj1.i = obj.i;
		obj1.j = obj.j;

		obj1.j = 555;

		System.out.println("Deep Copy");
		System.out.println(obj);
		System.out.println(obj1);

	}

}

class BCA {
	int i;
	int j;

	@Override
	public String toString() {
		return "BCA [i=" + i + ", j=" + j + "]";
	}

}