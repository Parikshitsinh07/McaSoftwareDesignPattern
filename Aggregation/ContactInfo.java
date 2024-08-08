class ContactInfo {
    private String homeAddress;
    private String emailAddress;
    private int telephoneNumber; //12025550156
	public ContactInfo(String homeAddress,String emailAddress,int telephoneNumber)
	{
		this.homeAddress = homeAddress;
		this.emailAddress = emailAddress;
		this.telephoneNumber = telephoneNumber;
	}
	public getHomeAddress(){
		return homeAddress;
	}
	public getEmailAddress(){
		return emailAddress;
	}
	public getTelephoneNumber(){
		return telephoneNumber;
	}
}