import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	
	
	public static void main(String []args) {
	Customer customer =new Customer(101,"vikas",null,Arrays.asList("9876543212","9876123456"));

		
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
	//	Optional<String> emailOptional = Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional2);
	}
}
