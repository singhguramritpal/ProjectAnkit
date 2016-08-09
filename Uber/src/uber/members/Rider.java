package uber.members;

public class Rider extends Member{
	
	private String creditNo;
	private String cvv;
	private String expirationDate;
	
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String toString(){
		return this.getName() + "(email: "+ this.getEmailId() 
			+ ", Contact No: " + this.getContactNo() + ") ";
	}

}
