package treeMap;

public class TeamLeader{
	
	private String desgn;
	private String tlName;
	public TeamLeader(String desgn, String tlName) {
		super();
		this.desgn = desgn;
		this.tlName = tlName;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public String getTlName() {
		return tlName;
	}
	public void setTlName(String tlName) {
		this.tlName = tlName;
	}
	@Override
	public String toString() {
		return "TeamLeader [desgn=" + desgn + ", tlName=" + tlName + "]";
	}
/*	@Override
	public int compareTo(Object o) {
		TeamLeader tl=(TeamLeader) o;
		
		return this.desgn.compareTo(tl.getDesgn());
	}
	*/

}
