package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public class FriendGraph {

    private static FriendGraph friendGraph;

    private FriendGraph() {
    }

    public static FriendGraph getGraph() {
        if(friendGraph == null) {
            friendGraph = new FriendGraph();
        }
        return friendGraph;
    }

    public void friends() {

    }
}
