public class Program1{
	public static void main(String [] args)
	{
		String homeAddress = "115,dharamnath Prabhu society, Naroda Ahmedabad";
		String emailAddress = "vaghelaparikshitsinh257@gmail.com";
		String telephoneNumber = "8469133412";
		ContactInfo contactInfo = new ContactInfo(homeAddress,emailAddress,telephoneNumber);
		String idNumber = "212308020";
		String bloodGroup = "B+";
		String accountNumber = "21165230";
		StudentId studentId = new StudentId(idNumber,bloodGroup,accountNumber);
		
		Student student =new Student("Parikshit",22,"A+",studentId);
		student.setContactInfo(contactInfo);
		student.StudentIfo();
		student.study();
	}
}