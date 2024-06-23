package inheritanceandinterfaces;

public class Bronze extends MembershipType{
    private  final int limit_Per_Day = 5;

    public Bronze() {
        super("Bronze");
    }

    @Override
    public  boolean isEligible(int points) {
        return points < 10;
    }


    @Override
    public boolean canTrade(Client client) {
        return client.getTradesDaily() < limit_Per_Day;
    }
}
