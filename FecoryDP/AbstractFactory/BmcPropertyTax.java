public class BmcPropertyTax implements PropertyTax{
	double amount;
	public double getTax(double property_value){
			amount=0.5*property_value;
			return amount;
	}

}