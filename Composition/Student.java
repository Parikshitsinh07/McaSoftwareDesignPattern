public class Student {
    private String name;
    private int age;
    private int grade;
	private ContactInfo contactInfo;//Student HAS-A ContactInfo
    private StudentId studentId;//Student HAS-A StudentId
	public Student(String name,int age,int grade,StudentId studentId){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentId = studentId;
	}
	public Student(String name,int age,int grade,StudentId studentId,ContactInfo contactInfo){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.studentId = studentId;
		this.contactInfo = contactInfo;
	}
	public setContactInfo(ContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}
    public void study() {
        System.out.println("Study");
    }
}