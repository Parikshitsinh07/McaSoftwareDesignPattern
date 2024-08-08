class ContactInfo {
    private String homeAddress;
    private String emailAddress;
    private String telephoneNumber; //12025550156
	public ContactInfo(String homeAddress,String emailAddress,String telephoneNumber)
	{
		this.homeAddress = homeAddress;
		this.emailAddress = emailAddress;
		this.telephoneNumber = telephoneNumber;
	}
	public String getHomeAddress(){
		return homeAddress;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public String getTelephoneNumber(){
		return telephoneNumber;
	}
}