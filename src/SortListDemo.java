import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String []args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(6);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach((t)->System.out.println(t));
		
		List<Employee> emplist=DataBase.getEmpList();
		
		
		Collections.sort(emplist, new MyCompator());
		Collections.sort(emplist, (e1,e2)->e1.getSalary()-e2.getSalary());
		
		
	//	emplist.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).forEach(e->System.out.println(e));
		
		
	//	emplist.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
		emplist.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		System.out.println(emplist);
		}
}
 
class MyCompator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {// ascending order
		return o1.getSalary()-o2.getSalary();
	}
	
//	public int compare(Employee o1, Employee o2) {// descending order
//		return o2.getSalary()-o1.getSalary();
//	}
}