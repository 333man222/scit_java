package vo;

public class PhoneVO {
	private String name;			// �̸�
	private String phoneNo; 		// ��ȭ��ȣ
	private String relationship;	// ���� (ģ��, �б�, ȸ��)
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
		System.out.printf("����: %s, �̸�: %s, ��ȭ��ȣ: %s%n", relationship, name, phoneNo);
	}
}
