public class Main{
	public static void main(String [] abc){
			Context con = new Context();
			Netbanking nb = new Netbanking();
			Upi upi = new Upi();
			con.setPayment(nb);
			con.setPayment(upi);
	}

}