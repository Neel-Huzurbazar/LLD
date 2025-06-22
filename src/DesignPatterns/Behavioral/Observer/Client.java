package DesignPatterns.Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        NewsPublisher publisher=new NewsPublisher();
        Observer observer1=new Subscriber("ABC");
        Observer observer2=new Subscriber("XYZ");
        publisher.addObserver(observer1);
        publisher.addObserver(observer2);
        publisher.notifyObservers("News published");
    }
}
