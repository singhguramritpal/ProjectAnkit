package uber.members;

public class Member {
	
	private int id;
	private String name;
	private String contactNo;
	private String emailId;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setContactNo(String contactNo){
		this.contactNo = contactNo;
	}
	public String getContactNo(){
		return this.contactNo;
	}
	
	public void setEmailId(String emailId){
		this.emailId = emailId;
	}
	public String getEmailId(){
		return this.emailId;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}

}
