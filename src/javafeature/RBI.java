package javafeature;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public class RBI {

	public static void main(String[] args) {

		Optional<String> id = HDFC.getIdentity();

		System.out.println("Details of Account Holder \n");
		System.out.println(id.orElse("Identity is null please check"));

		System.out.println("Id is Empty-" + id.isEmpty());
		System.out.println("Id is Provided-" + id.isPresent() + "\n");

		Optional<String> v = HDFC.getAddress();
		System.out.println(v.orElse(" Address is not  inserted "));

		System.out.println("Address is Empty-" + v.isEmpty());
		System.out.println("Address is Provided-" + v.isPresent() + "\n");

		System.out.println("Date and Time");
		LocalDate l = LocalDate.now();
		System.out.println(l);
		LocalTime t = LocalTime.now();
		System.out.println(t);

	}

}
