package simulado_q1;

import java.util.LinkedList;

public class User {
    private String id;
    private LinkedList<Tweet> tweets = new LinkedList<>();

    public String getId() {
        return id;
    }

    public User(String id){
        this.id = id;
    }

    public void addTweet(Tweet t){
        this.tweets.addFirst(t);
    }
    
    public double TotalTamTweets(){
        double total = 0;
        for(Tweet t : tweets){
            total += t.getText().length();
        }
        return total;
    }

}
