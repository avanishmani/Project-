package Day8.src.main.java.Model;

public class PartTimeInstructor extends Instructor {
	private int noOfSession;
	private int costPerSession;
	private String mobileNumber;
	public int getNoOfSession() {
		return noOfSession;
	}
	public void setNoOfSession(int noOfSession) {
		this.noOfSession = noOfSession;
	}
	public int getCostPerSession() {
		return costPerSession;
	}
	public void setCostPerSession(int costPerSession) {
		this.costPerSession = costPerSession;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
