public class Instrument {
    private String name;
    private String type;

    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void playSound() {
        System.out.println("The " + name + " is playing a sound!");
    }
}
