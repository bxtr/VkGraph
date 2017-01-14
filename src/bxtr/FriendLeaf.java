package bxtr;



/**
 * Created by basic on 14.01.2017.
 */
public class FriendLeaf {
    private final UserNode friendOne;
    private final UserNode friendTwo;

    public FriendLeaf(UserNode friendOne, UserNode friendTwo) {
        this.friendOne = friendOne;
        this.friendTwo = friendTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FriendLeaf)) return false;

        FriendLeaf that = (FriendLeaf) o;

        if (friendOne != null ? !friendOne.equals(that.friendOne) : that.friendOne != null) return false;
        return friendTwo != null ? friendTwo.equals(that.friendTwo) : that.friendTwo == null;
    }

    @Override
    public int hashCode() {
        int result = friendOne != null ? friendOne.hashCode() : 0;
        result = 31 * result + (friendTwo != null ? friendTwo.hashCode() : 0);
        return result;
    }
}
