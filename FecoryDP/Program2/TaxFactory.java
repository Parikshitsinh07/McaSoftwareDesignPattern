public class TaxFactory
{
     public static Tax getTaxFactory(int i,double amount)
	 {
	   do
	   {
	      switch(i)
		  {
		     case 1:{
						PropertyTax pt = new PropertyTax(amount);
						return pt;
					}
			 case 2:{
						WaterTax wt = new WaterTax(amount);
						return wt;
					}
			 case 3:{
						VehicleTax vt = new VehicleTax(amount);
						return vt;
					}
				
			 case 4:{
						EducationTax et = new EducationTax(amount);
						return et;
					}
			 case 5: System.exit(0);
			 default: return null;
		  }
	   }while(i!=5);
	 }
}