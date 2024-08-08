import java.util.Scanner;
class MainClient {
	 public static void main(String [] args)
	 {
		Scanner sc = new Scanner(System.in);
		int opt;
		double amount;
		System.out.println("1.Vanilla");
		opt = sc.nextInt();
		Icecream v = new Vanilla();
		v.getDiscription();
		amount = v.getCost();
		
		System.out.println("1.Chocolets\n 0.no Add One");
		opt = sc.nextInt();
		if(opt > 0){
			Chocolets c = new Chocolets(v);
			c.getDiscription();
			amount = amount + c.getCost();
		}
		System.out.println("Cost is "+amount);
		
	 }
}