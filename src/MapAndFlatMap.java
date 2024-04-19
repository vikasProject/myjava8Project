import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	
	public static void main(String []args) {
		
		List<Customer> customers=CustomerDatabase.getAll();
		List<String> emails=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		List<List<String>> phoneNO = customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
	//	System.out.println(emails);
	//	System.out.println(phoneNO);
		
		  List<String> flatmap = customers.stream().
				  flatMap(customer->customer.getPhoneNumbers().stream())
				  .collect(Collectors.toList());
		  System.out.println(flatmap);
	}
	
}
