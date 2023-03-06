package Day6.src.main.java.Model;

public class PhoneNumber {
	private int phoneId;
	private String phoneNumber;
  private String phoneType;    //(Home/Landline/office) [It should be persisted as enum]
//	private int userId;     // (Foreign Key)
public int getPhoneId() {
	return phoneId;
}


public PhoneNumber() {
	super();
}
public PhoneNumber(int phoneId, String phoneNumber, String phoneType) {
	super();
	this.phoneId = phoneId;
	this.phoneNumber = phoneNumber;
	this.phoneType = phoneType;
}
public void setPhoneId(int phoneId) {
	this.phoneId = phoneId;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPhoneType() {
	return phoneType;
}
public void setPhoneType(String phoneType) {
	this.phoneType = phoneType;
}
}
