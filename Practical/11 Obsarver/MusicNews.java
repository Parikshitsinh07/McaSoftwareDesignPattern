
public class MusicNews implements Subscriber {
	private String name;

    public MusicNews(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Dear " + name + ", the latest news: " + news);
    }
}
