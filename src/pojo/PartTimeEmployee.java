package pojo;

public class PartTimeEmployee extends Employee {

	private double monthlysal;

	public PartTimeEmployee(int id, String name, double monthlysal) {
		super(id, name);
		this.monthlysal = monthlysal;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlysal;
	}

	public double getMonthlysal() {
		return monthlysal;
	}

	public void setMonthlysal(double monthlysal) {
		this.monthlysal = monthlysal;
	}
	
	
	
}
