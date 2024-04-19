import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * public class PredicateDemo implements Predicate<Integer>{
 * 
 * @Override public boolean test(Integer t) { if(t%2==0) return true; else
 * return false; }
 * 
 * public static void main(String [] args) {
 * 
 * Predicate<Integer> predicate=new PredicateDemo();
 * System.out.println(predicate.test(7)); } }
 */

public class PredicateDemo{



	public static void main(String [] args) {
		
//		Predicate<Integer> predicate=(t)->{
//			if(t%2==0)
//				return true;
//			else
//				return false;
//		};
		Predicate<Integer> predicate=(t)-> t%2==0;
		System.out.println(predicate.test(70));
		List<Integer> list1= Arrays.asList(10,121,30,41,50);
		list1.stream().filter(predicate).forEach(c-> System.out.println("print even"+c));
		list1.stream().filter(p->p%2==0).forEach(c-> System.out.println("print even"+c));
		}
}
