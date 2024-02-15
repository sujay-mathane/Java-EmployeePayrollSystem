package main;

import pojo.FullTimeEmployee;
import pojo.PartTimeEmployee;
import pojo.Payroll;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll payroll=new Payroll();
		
		PartTimeEmployee jay=new PartTimeEmployee(1, "jay", 10000);
		FullTimeEmployee mahesh= new FullTimeEmployee(2, "Mahesh", 10, 100);
		payroll.addEmployee(jay);
		payroll.addEmployee(mahesh);
		payroll.displayAllEmployee();
	}

}
