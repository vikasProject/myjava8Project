import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

	
	public static List<Customer> getAll(){
		
		return Stream.of(
				new Customer(101,"vikas","t.vikas@gmail.com",Arrays.asList("9876543212","9876123456")),
				new Customer(101,"krishan","t.krishan@gmail.com",Arrays.asList("7896543212","7896123456")),
				new Customer(101,"reena","t.reena@gmail.com",Arrays.asList("4456543212","9566123456")),
				new Customer(101,"kavita","t.kavita@gmail.com",Arrays.asList("9666543212","9876123456")),
				new Customer(101,"preeti","t.preeti@gmail.com",Arrays.asList("9832543212","9876883456")),
				new Customer(101,"sourve","t.sourve@gmail.com",Arrays.asList("9876549812","9876453456"))
				).collect(Collectors.toList());
	}
}
