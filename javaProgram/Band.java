public class Band {
    private String name;
    private String genre;
    private int numberOfMembers;

    public Band(String name, String genre, int numberOfMembers) {
        this.name = name;
        this.genre = genre;
        this.numberOfMembers = numberOfMembers;
    }

    public void playMusic() {
        System.out.println("The band is playing music!");
    }

    public void introduceBand() {
        System.out.println("We are " + name + ", a " + genre + " band with " + numberOfMembers + " members.");
    }
}
