import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer>{

//	@Override
//	public void accept(Integer t) {
//		System.out.println("printing "+t);
//	}
//	
public class ConsumerDemo{
	public static void main(String []args) {
		
		Consumer<Integer> consumer=(t) ->{
			System.out.println("printing "+t);
			
		}; 
		consumer.accept(10);
		List<Integer> list1= Arrays.asList(10,120,30,40,50);
		list1.stream().forEach(consumer);
	}
}
