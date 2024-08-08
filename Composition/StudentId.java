class StudentId {
    private String idNumber;//A-123456789
    private String bloodGroup;
    private String accountNumber;
	public StudentId(String idNumber,String bloodGroup,String accountNumber)
	{
		this.accountNumber = accountNumber;
		this.bloodGroup = bloodGroup;
		this.idNumber = idNumber;
	}
	public getAccountNumber(){
		return accountNumber;
	}
	public getBloodGroup(){
		return bloodGroup;
	}
	public getIdNumber(){
		return idNumber;
	}
}