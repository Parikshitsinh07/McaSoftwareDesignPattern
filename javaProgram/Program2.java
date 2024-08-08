public class Program2 {
    public static void main(String[] args) {
        Band myBand = new Band("The Rockers", "Rock", 4);
        myBand.introduceBand();
        myBand.playMusic();

        Instrument guitar = new Instrument("Guitar", "String");
        guitar.playSound();
    }
}
