package comparator3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 2005,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7),
			 new Employee("Alex", 60000, 1998, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
//		NameComparator nameComp = new NameComparator();
//		Collections.sort(empList, nameComp);
		
		
//		HireDateComparator hComp = new HireDateComparator();
//		Collections.sort(empList, hComp);
		
		
		SalaryComparator sComp = new SalaryComparator();
		Collections.sort(empList,sComp);
		
		System.out.println(empList);
		
	}

}
