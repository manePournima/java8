package javafeature;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 obj = new Test1();

		Test1 obj1 = (Test1) obj.clone();

		obj1.i = 9;
		System.out.println("clonable");
		System.out.println(obj);
		System.out.println(obj1);
	}

}

class Test1 implements Cloneable {
	int i = 8;
	int j = 7;

	@Override
	public String toString() {
		return "Test [i=" + i + ", j=" + j + "]";

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}