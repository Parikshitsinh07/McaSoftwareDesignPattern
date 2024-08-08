
public class Main {

	public static void main(String[] args) {
		NewspaperPublisher newspaper = new NewspaperPublisher();

        Subscriber subscriber1 = new SportsNews("Alice");
        Subscriber subscriber2 = new MusicNews("Bob");

        newspaper.registerObserver(subscriber1);
        newspaper.registerObserver(subscriber2);

        newspaper.setLatestNews("New Prime Minister Elected!");

        newspaper.removeObserver(subscriber2);

        newspaper.setLatestNews("SpaceX Launches New Mission!");

	}

}
