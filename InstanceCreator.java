package observer;

public class InstanceCreator {
    public Human getInstance(String type){
        if(type.toLowerCase().equals("person")){
            return new Person();
        }
        else {
            return new Follower();
        }

    }
}
