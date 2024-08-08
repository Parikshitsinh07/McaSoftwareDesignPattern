public class BmcWaterTax implements WaterTax{
	double amount;
	public double getTax(double Water_value){
			amount=0.3*Water_value;
			return amount;
	}

}