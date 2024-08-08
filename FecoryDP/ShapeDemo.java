import java.util.*;
class ShapeDemo{
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int op,choose;
		String ch,str;
		
		do{
			System.out.println("Select Your Shape");
			System.out.println("0.Exit");
			System.out.println("1.Rectangle");
			System.out.println("2.Cricle");
			op = sc.nextInt();
			switch(op){
				case 1: str =  "Rectangle";
						break;
				case 2: str =  "Cricle";
						break;
				case 0:break;
				default:System.out.println("Invelid  option");
						break;
				}
			if(str != null){
				Shape shape = new str();
			}
			shape.dew();
		}while(op!=0);
	}
}