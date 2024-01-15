package javafeature;

public class DefaultStatic implements A, B {

	public static void main(String[] args) {

		DefaultStatic d = new DefaultStatic();
		d.add(); // abstract method
		A.sub(); // static method called
		B.sub();
		d.mult(); // default mult method

	}

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("Abstract Addition method-" + (a + b));

	}

	private void sub() {

		System.out.println("Static Substract method");
	}

	@Override
	public void mult() {
		A.super.mult();
		B.super.mult();
	}

}

interface A {
	public void add();

	public static void sub() {
		int a = 10;
		int b = 20;

		System.out.println(" A- Static Substract method" + (a - b));
	}

	public default void mult() {
		int a = 10;
		int b = 20;
		System.out.println(" A- Default Multiplication method-" + (a * b));
	}
}

interface B {
	int a = 100;
	int b = 20;

	public void add();

	public static void sub() {

		System.out.println(" B- Static Substract method-" + (a - b));
	}

	public default void mult() {
		System.out.println(" B- Default Multiplication method-" + (a * b));
	}

}