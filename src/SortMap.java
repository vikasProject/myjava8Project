import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Comparator;
public class SortMap {

	
	public static void main(String []args) {
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("eight", 8);
		map.put("ten", 10);
		map.put("four", 4);
		map.put("one", 1);
		
//		List<Entry<String, Integer>> entires=new ArrayList<>(map.entrySet()); 
//		Collections.sort(entires, (e1,e2)->e2.getValue().compareTo(e1.getValue()));
//		System.out.println(entires.toString());
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		/*
		 * Map<Employee, Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return
		 * o1.getSalary()-o2.getSalary(); }
		 * 
		 * });
		 */
		Map<Employee, Integer> empMap = new TreeMap<>((o1,o2)->o1.getSalary()-o2.getSalary());

		 empMap.put(new Employee(176,"vikas","innovation",7000000), 70);
		empMap.put(new Employee(176,"sunil","management",8000000),80);
		empMap.put(new Employee(176,"navneet","technical",5000000), 50);
		empMap.put(new Employee(176,"krinshan","finance",6000000),60);
		System.out.println(empMap);
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		empMap.entrySet().stream().sorted((e1,e2)->e1.getValue()).forEach(System.out::println);
		
		
	}
}
