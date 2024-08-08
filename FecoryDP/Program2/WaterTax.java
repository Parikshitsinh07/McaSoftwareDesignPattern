public class WaterTax implements Tax
{
	private double amount;
	private double water_value;
	
	public WaterTax(double water_value)
	{
		this.water_value=water_value;
	}
	private void calculateTax()
	{
		amount=0.3*water_value;
	}
	public double getDetail()
	{
		calculateTax();
		return amount;
	}
}
