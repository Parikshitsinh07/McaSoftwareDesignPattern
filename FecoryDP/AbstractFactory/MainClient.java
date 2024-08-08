import java.util.Scanner;
class MainClient
{	
		public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int cityopt = 0;
	   int opt = 0;
	   double amount= 0;
	   double tax = 0;
	   Abstractfactory city = null;
	   PropertyTax PT = null;
	   WaterTax WT = null;
	   
		   System.out.println("========================");
		   System.out.println("    Tax Calculator ");
		   System.out.println("========================");
		   System.out.println("1.Amc \n2.Bmc \n3.Rmc\n0.Exit\n");
		   System.out.print("Select Your City:");
		   cityopt=sc.nextInt();
		   try{
				city = Abstractfactory.getFactory(cityopt);
				System.out.println("1.Properti Tax \n2.Water Tax\n0.Exit\n");
				System.out.print("Select One Option:");
				opt=sc.nextInt();
				System.out.print("Enter Your Amount:");
				amount = sc.nextDouble();
		   }
		   catch(Exception es)
		   {
			   System.out.println("SorryOption");
		   }
		switch(opt){
			case 1:try
					{
						PT = city.getPropertyTax();
						tax = PT.getTax(amount);
						System.out.println("Your Tax is :" + tax);
					}
					catch(Exception e)
					{
						System.out.println("SorryPropary");
					}
					break;
			case 2:try
					{
						WT = city.getWaterTax();
						tax = WT.getTax(amount);
						System.out.println("Your Tax is :" + tax);
					}
					catch(Exception e)
					{
						System.out.println("Sorrywater");
					}
					break;
			case 0: System.out.println("Sorry");
					break;
			default :break;
		}
			
	
		   
		   
		   
   }
}