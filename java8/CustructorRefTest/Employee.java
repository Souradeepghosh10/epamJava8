package CustructorRefTest;

public class Employee {

	String name;
	int salary;
	String account;

	public Employee(String name, int salary, String account) {
		this.name = name;
		this.salary = salary;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return ("Employee[ " + " Name:" + this.getName() + " account :" + this.getAccount() + " Salary :"
				+ this.getSalary() + "]");
	}
}
