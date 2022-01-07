package observer;

import java.util.ArrayList;
import java.util.List;

public class Person implements Subject {
    private List<Observer> followers = new ArrayList<Observer>();
    private String name;
    private String post_title;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost_title() {
        return post_title;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void follow(Observer flr){
        followers.add(flr);
    }

    @Override
    public void unfollow(Observer flr){
        followers.remove(flr);
    }

    @Override
    public void notifyFollowers(){
        for (Observer f :
                followers) {
            f.update();
        }
    }

    @Override
    public void uploadPost(String post_title){
        this.post_title = post_title;
        notifyFollowers();
    }
}
