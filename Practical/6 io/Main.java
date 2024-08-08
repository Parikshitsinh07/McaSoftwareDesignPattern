import java.util.*;
public class Main
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		IO io=new ConsoleIO();
		int ch;
		do{
		System.out.println("Choose any Operation");
		System.out.println();
		System.out.println("1.UpperCase Data");
		System.out.println("2.LowerCase Data");
		System.out.println("3.Reverse Data");
		System.out.println("0.Exit");
		System.out.print("Enter your choice:");
		ch=sc.nextInt();
		String input;
		switch(ch)
		{
			case 1:
			IO ucd = new UppercaseDecorator(io);
			
			io.write("Enter text to convert to Uppercase:");
            input = io.read();
            ucd.write(input);
            break;
			
			case 2:
			IO lcd = new LowercaseDecorator(io);
            io.write("Enter text to convert to Lowercase:");
            input = io.read();
            lcd.write(input);
            break;
			
            case 3:
			IO rd = new ReverseDecorator(io);
             io.write("Enter text to reverse:");
             input = io.read();
             rd.write(input);
			 break;
			
            default:
              io.write("Invalid choice!");
		}	
		}while(ch != 0);
	}



}