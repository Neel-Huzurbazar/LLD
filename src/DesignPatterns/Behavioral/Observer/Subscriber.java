package DesignPatterns.Behavioral.Observer;

public class Subscriber implements Observer {
    private String subsriberName;
    public Subscriber(String name){
        this.subsriberName=name;
    }
    @Override
    public void update(String news) {
        System.out.println(this.subsriberName+" "+"received a news"+" "+news);
    }
}
