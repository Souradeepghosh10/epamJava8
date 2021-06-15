package LamdaExpJava;

public class EmpName {
	public String empName;
	public int empNum;
	
	public EmpName(int empNum,String empName) {
		this.empNum=empNum;
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

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	
	
}
