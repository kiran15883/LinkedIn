package observer;

public class LinkedIN  {
    public static void main(String[] args) {

        Subject followee_nilam = (Subject) new InstanceCreator().getInstance("Person");
        followee_nilam.setName("Nilam");


        Observer follower_jayant = (Follower) new InstanceCreator().getInstance("Follower");
        follower_jayant.setName("Jayant");
        Observer follower_sonam = (Follower) new InstanceCreator().getInstance("Follower");
        follower_sonam.setName("Sonam");
        Observer follower_trisha = (Follower) new InstanceCreator().getInstance("Follower");
        follower_trisha.setName("Trisha");
        Observer follower_rahul = (Follower) new InstanceCreator().getInstance("Follower");
        follower_rahul.setName("Rahul");

        followee_nilam.follow(follower_jayant);
        followee_nilam.follow(follower_sonam);
        followee_nilam.follow(follower_trisha);
        followee_nilam.follow(follower_rahul);

        follower_jayant.followedPerson(followee_nilam);
        follower_sonam.followedPerson(followee_nilam);
        follower_trisha.followedPerson(followee_nilam);
        follower_rahul.followedPerson(followee_nilam);


        followee_nilam.unfollow(follower_trisha);

        followee_nilam.uploadPost("New Feature in C# ");
        
        System.out.println();
        Login login = new User();
		login.giveAccountDetails();
		System.out.println(login.getLogin());
    }
}

