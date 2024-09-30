// Subject 

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    // Register a new observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Unregister an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers about the news update
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    // Update news and notify observers
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
