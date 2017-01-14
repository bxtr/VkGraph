package test;
import bxtr.GraphFactory;
import bxtr.UserNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by basic on 14.01.2017.
 */
public class SimpleTest {

    @Test
    public void CreateUserNodeTest() {
        UserNode userNode = GraphFactory.newUserNode().setName("Вова").setID(1);
        Assert.assertEquals("Вова", userNode.getName());
        Assert.assertEquals(1, userNode.getID());
    }

    @Test
    public void FriendTest() {
        UserNode userOne = GraphFactory.newUserNode().setID(1).setName("Вова");
        UserNode userTwo = GraphFactory.newUserNode().setID(2).setName("Кеша");
        userOne.friends(userTwo);
        Assert.assertEquals(true, userOne.isFriends(userTwo));
        Assert.assertEquals(true, userTwo.isFriends(userOne));
    }

    @Test
    public void NotFriendTest() {
        UserNode userOne = GraphFactory.newUserNode().setID(1).setName("Вова");
        UserNode userTwo = GraphFactory.newUserNode().setID(2).setName("Кеша");
        Assert.assertEquals(false, userOne.isFriends(userTwo));
        Assert.assertEquals(false, userTwo.isFriends(userOne));
    }

}
