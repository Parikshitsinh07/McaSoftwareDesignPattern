import java.util.*;
import java.io.*;

class FileAcess {
    public static void main(String[] a1) throws IOException {
        Scanner s = new Scanner(System.in);

		try{
			      System.out.println("1.Admin\n2.User\n3.Guest");
        int c = s.nextInt();
        System.out.println("Enter file name : ");
        String file = s.next();
        FileInterface b = new ProxyFile(file, c);
		if(b != null){
			System.out.println(b.write("Hello Parikshit\nHow Are You?\n"));
			System.out.println(b.read());
			System.out.println(b.delete());
		}else{
			System.out.println("Parmisstion not allow !");
		}
			
			
		}catch(Exception e){
			 e.printStackTrace();
		}
        
    }
}