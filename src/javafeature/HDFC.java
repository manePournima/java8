package javafeature;

import java.util.Optional;
//It is used to represent a value that may or may not be present.

public class HDFC {

	public static Optional<String> getIdentity() {
		String identity = null;

		return Optional.ofNullable(identity);

	}

	public static Optional<String> getAddress() {
		String address = "PUNE";

		return Optional.ofNullable(address);
		
		
		
	}

}