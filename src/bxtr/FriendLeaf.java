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
    public boolean equals(Object object) {
        if (!(object instanceof FriendLeaf)) return false;
        FriendLeaf friendLeaf = (FriendLeaf) object;
        return (this.friendOne.equals(friendLeaf.friendOne) && this.friendTwo.equals(friendLeaf.friendTwo) ||
                this.friendOne.equals(friendLeaf.friendTwo) && this.friendTwo.equals(friendLeaf.friendOne));
    }

    @Override
    public int hashCode() {
        if(friendOne.getID() < friendTwo.getID()) {
            return friendOne.getID();
        } else {
            return friendTwo.getID();
        }
    }
}
