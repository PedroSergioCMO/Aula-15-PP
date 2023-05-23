import java.util.ArrayList;
import java.util.List;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Movie movie);
}

class MoviePlatform implements Subject {
    private List<Observer> observers;

    public MoviePlatform() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Movie movie) {
        for (Observer observer : observers) {
            observer.update(movie);
        }
    }
}
