public class Student {
    private String name;
    private int age;
    private String grade;
	private ContactInfo contactInfo;//Student HAS-A ContactInfo
    private StudentId studentId;//Student HAS-A StudentId
	public Student(String name,int age,String grade,StudentId studentId){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentId = studentId;
	}
	public Student(String name,int age,String grade,StudentId studentId,ContactInfo contactInfo){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentId = studentId;
		this.contactInfo = contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}
	public void StudentIfo(){
		System.out.println("Student Name is:" + this.name);
		System.out.println("Student age is:" + this.age);
		System.out.println("Student grade is:" + this.grade);
		System.out.println("Student studentId is:" + this.studentId.getIdNumber());
		System.out.println("Student Address is:" + this.contactInfo.getHomeAddress());
		System.out.println("Student Email is:" + this.contactInfo.getEmailAddress());
		System.out.println("Student Telephone Number is:" + this.contactInfo.getTelephoneNumber());
	}
    public void study() {
        System.out.println("Study");
    }
}