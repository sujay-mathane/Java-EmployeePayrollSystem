package pojo;

import java.util.ArrayList;

public class Payroll {

	private ArrayList<Employee> employeeList;

	public Payroll() {
		super();
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
		System.out.println("Employee Added successful");
	}

	public void removeEmployee(int id) {
		Employee emptobeRemoved = null;

		for (Employee e : employeeList) {
			if (e.getId() == id) {
				emptobeRemoved = e;
				break;
			}
		}
		if (emptobeRemoved == null) {
			System.out.println("id not found, to remove from system");
		} else {
			employeeList.remove(emptobeRemoved);
			System.out.println("Employee removed successfully");
		}

	}
	
	public void displayAllEmployee() {
		for(Employee e: employeeList) {
			System.out.println(e.toString());
		}
	}

}
