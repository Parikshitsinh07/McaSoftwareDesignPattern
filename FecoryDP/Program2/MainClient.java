import java.util.Scanner;
class MainClient
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int opt;
	   double amount;
	   do
	   {
		   System.out.println("========================");
		   System.out.println("    Tax Calculator ");
		   System.out.println("========================");
		   System.out.print("1.Property Tax\n2.Water Tax\n3.VehicleTax\n4.Education Tax\n5.Exit\n");
		   System.out.println("Select One Option To calculateTax");
		   opt=sc.nextInt();
		   if(opt >0 && opt < 5){
				 System.out.println("Enter Your amount : ");
				amount = sc.nextDouble();
				getOutput(opt,amount);
		   }
	   }while(opt!=5);
   }
	public static void getOutput(int opt,double amount){
				double tax;
				Tax t1 = TaxFactory.getTaxFactory(opt,amount);
				tax = t1.getDetail();
				System.out.println("\t======================================");
				System.out.println("\t|Given Amount is :\t"+ amount +"Rs |");
				System.out.println("\t|Tax Amount  is :\t"+String.format("%.2f",tax)+"Rs |");
				System.out.println("\t======================================");
	   }
}