package net.scit41.shop.vo;

public class AddressVO {
	private String name;
	private String relationship;
	private String phoneNo;
	private String address;
	private String mail;
	
	public AddressVO() { }
	public AddressVO(String name, String relationship, String phoneNo, String address, String mail) {
		super();
		this.name = name;
		this.relationship = relationship;
		this.phoneNo = phoneNo;
		this.address = address;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "AddressVO [name=" + name + ", relationship=" + relationship + ", phoneNo=" + phoneNo + ", address="
				+ address + ", mail=" + mail + "]";
	}
	
}
