package pojo;

public class FullTimeEmployee extends Employee {

	private int hrsworked;
	private int ratePerHr;
	
	
	public FullTimeEmployee(int id, String name, int hrsworked, int ratePerHr) {
		super(id, name);
		this.hrsworked = hrsworked;
		this.ratePerHr = ratePerHr;
	}

	public int getHrsworked() {
		return hrsworked;
	}


	public void setHrsworked(int hrsworked) {
		this.hrsworked = hrsworked;
	}

	public int getRatePerHr() {
		return ratePerHr;
	}


	public void setRatePerHr(int ratePerHr) {
		this.ratePerHr = ratePerHr;
	}


	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hrsworked*ratePerHr;
	}
	
	

}
