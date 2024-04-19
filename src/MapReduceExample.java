import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String []args) {
		
		
		List<Integer> list=Arrays.asList(1,4,5,67,7);
		
		int sum=list.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		int reducesum=list.stream().reduce(0,(a,b) -> a+b);
		System.out.println(reducesum);
		
		Optional<Integer> reducesum2=list.stream().reduce(Integer::sum);
		System.out.println(reducesum2.get());
		
		int reducemulti=list.stream().reduce(1,(a,b) -> a*b);
		System.out.println(reducemulti);
	}
}
