
import java.util.*;

public class NewspaperPublisher{
	private List<Subscriber> subscriber = new ArrayList<>();
    private String latestNews;

    
    public void registerObserver(Subscriber subscriber) {
        this.subscriber.add(subscriber);
    }

    
    public void removeObserver(Subscriber subscriber) {
        this.subscriber.remove(subscriber);
    }

    
	private void notifyObservers() {
        for (Subscriber subscriber : subscriber) {
            subscriber.update(latestNews);
        }
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

}
