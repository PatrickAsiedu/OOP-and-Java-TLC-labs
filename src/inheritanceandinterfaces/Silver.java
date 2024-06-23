package inheritanceandinterfaces;

public class Silver extends MembershipType{
    public Silver() {
        super("Silver");
    }

    @Override
    public boolean isEligible(int points) {
        return points >=10 &&  points < 20;
    }
}
