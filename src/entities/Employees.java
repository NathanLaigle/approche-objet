package entities;

public class Employees {
	
	public Employees(String employee) {
		String[] employeeArray = employee.split(";");
		this.lastName = employeeArray[0];
		this.firstName = employeeArray[1];
		this.wage = Double.parseDouble(employeeArray[2].replace(" ", ""));
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	private String lastName;
	private String firstName;
	private double wage;

}
