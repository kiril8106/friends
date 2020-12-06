package friends;

import java.util.ArrayList;

public class Friends {
    String[] myFriends = {
            "Vasya", "Sasha", "Mary", "Ann"
    };
    ArrayList myFriendsvar = new ArrayList();

    Friends() {
        for (var friend : myFriends) {
            myFriendsvar.add(friend);
        }
    }

    void addNewFriend(String friend) {
        myFriendsvar.add(friend);
    }
}