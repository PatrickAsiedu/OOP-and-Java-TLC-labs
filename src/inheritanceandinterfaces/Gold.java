package inheritanceandinterfaces;

public class Gold extends MembershipType{

    public Gold() {
        super("Gold");

    }

    @Override
    public boolean canTrade(Client client) {
        return false;
    }

    @Override
    public boolean isEligible(int points) {
        return points>20;
    }
}
