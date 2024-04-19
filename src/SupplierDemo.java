import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String>{
public class SupplierDemo{
	
	

//	@Override
//	public String get() {
//		// TODO Auto-generated method stub
//		return " Hi java code";
//	}
	
	public static void main(String []args) {
//		Supplier<String> supplier =new SupplierDemo();
		Supplier<String> supplier=()-> "HI java code";
	//	System.out.println(supplier.get());
		List<String> list1= Arrays.asList("vikas","preeti","navneet","navin","sunil");
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		List<String> list2= Arrays.asList();
		System.out.println(list2.stream().findAny().orElseGet(supplier));
		System.out.println(list2.stream().findAny().orElseGet(()->"hi coders"));
	}
	
}
