public class AmcFactory {
    public static Tax getAmcFactory(int option) {
        switch(option) {
            case 1: {
                AmcPropertyTax apt = new AmcPropertyTax();
                return apt;
            }
            case 2: {
                AmcWaterTax awt = new AmcWaterTax();
                return awt;
            }
            default: {
                // Handle invalid option
                return null;
            }
        }
    }
}
