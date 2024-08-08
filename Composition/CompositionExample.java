public class CompositionExample {
    public static void main(String[] args) {
	
        Battery phoneBattery = new Battery(3000, "Lithium-ion");

        MobilePhone myPhone = new MobilePhone("Samsung", phoneBattery);

        System.out.println(myPhone);
    }
}
