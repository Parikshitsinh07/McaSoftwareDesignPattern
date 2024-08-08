public class RmcWaterTax implements WaterTax{
	double amount;
	public double getTax(double Water_value){
			amount = 0.5 * Water_value;
			return amount;
	}

}