package enums;

public enum Membership {
    Bronze(5,"No trading before 10am"),
    SILVER(10, ""),
    GOLD(15, "");

    private final int tradeLimit;
    private final String restriction;

    Membership(int tradeLimit, String restriction) {
        this.tradeLimit = tradeLimit;
        this.restriction = restriction;

    }

    public int getTradeLimit() {
        return tradeLimit;
    }

    public String getRestriction() {
        return restriction;
    }
}
