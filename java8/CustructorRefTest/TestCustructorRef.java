package CustructorRefTest;

public class TestCustructorRef {

	public static void main(String[] args) {
		ObjectServTest objTest = Employee::new;
		Employee employee = objTest.get("testEmp", 4000, "Savings");
		System.out.println(employee);
	}

}
