class Chocolets extends Decoretor
{
	double cost = 5;
   public Chocolets(Icecream icecream)
   {
	   super(icecream);
   }
   public double getCost(){
	   return cost;
   }
   public void getDiscription(){
	   System.out.println("Chocolets is add");
   }
}