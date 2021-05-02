package vo;

public class PhoneVO {
	private String name;			// 이름
	private String phoneNo; 		// 전화번호
	private String relationship;	// 관계 (친구, 학교, 회사)
	public PhoneVO() {
		// TODO Auto-generated constructor stub
	}
	public PhoneVO(String name, String phoneNo, String relationship) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.relationship = relationship;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phoneNo;
	}
	public void setPhone(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public void output() {
		System.out.printf("관계: %s, 이름: %s, 전화번호: %s%n", relationship, name, phoneNo);
	}
}
