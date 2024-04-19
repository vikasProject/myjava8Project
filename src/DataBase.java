import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmpList(){
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(176,"vikas","innovation",7000000));
		list.add(new Employee(176,"sunil","management",8000000));
		list.add(new Employee(176,"navneet","technical",6000000));
		list.add(new Employee(176,"krinshan","finance",5000000));
		return list;
	}
}
