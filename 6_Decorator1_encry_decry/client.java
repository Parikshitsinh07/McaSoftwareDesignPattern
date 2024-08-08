import java.util.Base64;
public class client {
    public static void main(String[] args) {
        /*String s = "Satyajit PratapSinh zala";
        DataSourceDecorator encoded = new EncryptionDecryptionDecorator(new FileDataSource("Decorator.txt"));
        encoded.writeData(s);
        DataSource ds = new FileDataSource("Decorator.txt");

        System.out.println("Name:");
        System.out.println(s);
        
        System.out.println("Encoded String:");
        System.out.println(ds.readData());

        System.out.println("Decoded String:");
        System.out.println(encoded.readData());*/
		String data = "Parikshit";
		 byte[] result = data.getBytes();
		 byte[] result2 = Base64.getDecoder().decode(data);
		 System.out.println(result);
		  System.out.println(result2);
    }
}