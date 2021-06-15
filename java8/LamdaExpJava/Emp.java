package LamdaExpJava;

public class Emp {
	public String empName;
	
	public Emp(String empName) {
		this.empName=empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	  @Override public String toString() {     
	      return ("Emp[ "+"Name:"+this.getEmpName()+"]"); 
	   }
	
	
}
