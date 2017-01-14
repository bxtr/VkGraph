package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public class UserNode {

    private int id;
    private String name;


    public void friends(UserNode userNode) {
        FriendGraph.getGraph().friends(this, userNode);
    }

    public boolean isFriends(UserNode node) {
        return FriendGraph.getGraph().isFriends(this, node);
    }

    public UserNode setName(String name) {
        this.name = name;
        return this;
    }

    public UserNode setID(int id) {
        this.id = id;
        return this;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}
