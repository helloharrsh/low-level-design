// Client code 

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        // Create subscribers
        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");

        // Add subscribers to the news agency
        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);

        // Publish a news update
        newsAgency.setNews("Breaking News: Observer pattern in action!");

        // Remove one subscriber and publish another update
        newsAgency.removeObserver(subscriber1);
        newsAgency.setNews("More News: Design patterns are fun!");
    }
}
