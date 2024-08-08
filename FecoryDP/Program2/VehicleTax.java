public class VehicleTax implements Tax
{
	private double amount;
	private double numofwheel;
	
	public VehicleTax(double numofwheel)
	{
		this.numofwheel=numofwheel;
	}
	 private void calculateTax()
	{
		amount=0.5*numofwheel;
	}
	public double getDetail()
	{
		calculateTax();
		return amount;
	}
}
