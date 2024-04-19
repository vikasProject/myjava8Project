package BiFucntional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionalExample implements BiFunction<List<Integer>, List<Integer>,List<Integer>>{

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		
		return Stream.of(list1,list2)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}

	public static void main(String []args) {
		BiFunction biFunction= new BiFunctionalExample();
		List<Integer> list1=Stream.of(4,6,3,4,34,4).collect(Collectors.toList());
		List<Integer> list2=Stream.of(3,5,7,9,24,7).collect(Collectors.toList());
		System.out.println(biFunction.apply(list1, list2));
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunctio2=new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
				
				return Stream.of(l1,l2).flatMap(List::stream).distinct().collect(Collectors.toList());
			}
			
		};
		
		System.out.println(biFunctio2.apply(list1, list2));
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2=( l1, l2) -> Stream.of(l1,l2)
																			.flatMap(List::stream)
																			.distinct()
																			.collect(Collectors.toList());
		System.out.println(biFunction2.apply(list1,list2));
	}
	
	
}
