package observer;

public class Follower implements Observer {
    private String name;
    private Subject person = new Person();

    public Follower(){}

    public void setName(String name) {
        this.name = name;
    }

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println( name + " \n " + " New Post from "+  person.getName() + "\n " + person.getPost_title() + " uploaded successfully...  " );
    }


    @Override
    public void followedPerson(Subject p){
        person = p;
    }
}

