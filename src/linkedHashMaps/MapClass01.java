package linkedHashMaps;

public class MapClass01 {

	private String fname;
	private String lname;
	private String sonof;
	private int age;
	public MapClass01(String fname, String lname, String sof, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sonof = sof;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSonof() {
		return sonof;
	}
	public void setSof(String sof) {
		this.sonof = sonof;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "MapClass01 [fname=" + fname + ", lname=" + lname + ", sonof=" + sonof + ", age=" + age + "]";
	}
	
	
}
