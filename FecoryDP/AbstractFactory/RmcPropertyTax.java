public class RmcPropertyTax implements PropertyTax{
	double amount;
	public double getTax(double property_value){
			amount=0.7*property_value;
			return amount;
	}

}