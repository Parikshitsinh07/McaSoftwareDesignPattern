import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int opt;
	   do
	   {
		   System.out.println("1.Create Rectangle");
		   System.out.println("2.Create Circle");
		   System.out.println("enter your choise ");
		   opt=sc.nextInt();
		   switch(opt)
		   {
			   case 1:
			          Rctangle r1=new  Rctangle();
	                  r1.draw();
	                  r1.fillcolor();
					  break;
			  case 2:
			         Circle c1=new Circle();
	                 c1.draw();
	                 c1.fillcolor();
					 break;
			 case 3:
			        System.out.println("Exit");
					opt=3;
					break;
			default:
			      System.out.println("Wrong choise");
				  break;
			   
		   }
		   
		   
	   }while(opt!=3);
       
	   Circle c1=new Circle();
	   c1.draw();
	   c1.fillcolor();
   }
}