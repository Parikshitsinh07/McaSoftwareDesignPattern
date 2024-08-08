public class AmcWaterTax implements WaterTax{
	double amount;
	public double getTax(double Water_value){
			amount=0.4*Water_value;
			return amount;
	}

}