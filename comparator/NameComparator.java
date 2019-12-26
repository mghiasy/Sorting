package comparator3;

import java.util.Comparator;
import java.util.Date;

public class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();

		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
		//now name1 equals name2
		if(hireDate1.compareTo(hireDate2) != 0) {
			return hireDate1.compareTo(hireDate2);
		}
		//now name1 equals name2 and hireDate1 equals hireDate2
        // if(salary1 < salary2) {
			// return -1;
		// }
		// else if(salary1 > salary2) {
			// return 1;
		// }
		// else {
			// return 0;
		// }
		
		return Double.compare(e1.getSalary(), e2.getSalary());
	}	
}


	

