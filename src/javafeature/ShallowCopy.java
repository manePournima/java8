package javafeature;

public class ShallowCopy {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.i = 10;
		obj.j = 20;

		// in shallow copy when change in one entity reflect on other entity
		// it will check reference

		ABC obj1 = obj;
		obj1.i = 5;
		System.out.println("Shallow copy");
		System.out.println(obj); // 10 20
		System.out.println(obj1); // expected- 5 20

	}

}

class ABC {
	int i;
	int j;

	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}

}
