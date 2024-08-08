public class EducationTax implements Tax
{
    private double rate=0.2;
	private double amount;
	private double numofstudent;
	
	public EducationTax(double numofstudent)
	{
		this.numofstudent = numofstudent;
	}
	private void calculateTax()
	{
		amount=0.2*numofstudent;
	}
	public double getDetail()
	{
		calculateTax();
		return amount;
	}
}
