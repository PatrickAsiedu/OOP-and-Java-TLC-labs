package inheritanceandinterfaces;

public abstract class MembershipType {
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "MembershipType{" +
                "typeName='" + typeName + '\'' +
                '}';
    }



    public MembershipType(String typeName) {
        this.typeName = typeName;
    }

    public abstract boolean isEligible(int points);

    public abstract boolean canTrade(Client client);
}


