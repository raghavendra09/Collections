package linkedHashMaps;

public class MapClass02 {

	private String company;
	private String designation;
	private String address;
	private String gender;
	private int salary;
	public MapClass02(String company, String designation, String address, String gender, int salary) {
		super();
		this.company = company;
		this.designation = designation;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MapClass02 [company=" + company + ", designation=" + designation + ", address=" + address + ", gender="
				+ gender + ", salary=" + salary + "]";
	}
	
	

}
