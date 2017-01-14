package bxtr;

import java.util.HashSet;
import java.util.List;

/**
 * Created by basic on 14.01.2017.
 */
public class FriendGraph {

    private static FriendGraph friendGraph;
    private HashSet<FriendLeaf> allFriendLeafs;

    private FriendGraph() {
        allFriendLeafs = new HashSet<>();
    }

    public static FriendGraph getGraph() {
        if(friendGraph == null) {
            friendGraph = new FriendGraph();
        }
        return friendGraph;
    }

    public void friends(UserNode one, UserNode two) {
        allFriendLeafs.add(new FriendLeaf(one, two));
    }

    public boolean isFriends(UserNode one, UserNode two) {
        FriendLeaf temp = new FriendLeaf(one, two);
        return allFriendLeafs.contains(temp);
    }
}
