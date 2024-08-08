public class PropertyTax implements Tax
{
    //private double rate=18.0;
	private double amount;
	private double property_value;
	
	public PropertyTax(double property_value)
	{
		this.property_value=property_value;
	}
	private void calculateTax(){
		amount=0.7*property_value;
	}
	public double getDetail()
	{
		calculateTax();
		return amount;
	}
}
