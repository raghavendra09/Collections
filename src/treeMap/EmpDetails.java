package treeMap;

public class EmpDetails implements Comparable{
	private int empId;
	private String empName;
	private long empNo;
	public EmpDetails(int empId, String empName, long empNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "EmpDetails [empId=" + empId + ", empName=" + empName + ", empNo=" + empNo + "]";
	}
	@Override
	public int compareTo(Object arg0) {
    EmpDetails es=(EmpDetails) arg0;
		return this.empName.compareTo(es.getEmpName());
	}
	
	

}
