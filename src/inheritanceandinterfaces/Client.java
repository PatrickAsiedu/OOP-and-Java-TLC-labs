package inheritanceandinterfaces;

import objectsandclasses.Trade;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private  int tradingPoints;
    private MembershipType membershipType;
    private List<Trade> trades = new ArrayList<>();
    private int tradesDaily;

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }

    public int getTradesDaily() {
        return tradesDaily;
    }

    public void setTradesDaily(int tradesDaily) {
        this.tradesDaily = tradesDaily;
    }

    public Client(String firstName, String lastName, int tradingPoints, MembershipType membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tradingPoints = 0;
        this.membershipType = null;
    }

    public void trade(Trade trade){
        trades.add(trade);
        tradingPoints++;
        updateMembership();


    }

    public void addTrade(Trade trade){
        //filter all trades made today and count

        if(membershipType.canTrade(this)){
            trades.add(trade);
            tradingPoints++;
            updateMembership();
        }
    }

//    public void canTrade(){
//
//
//    }

    public void updateMembership(){
        if (tradingPoints >= 20) {
            membershipType = new Gold();
        } else if (tradingPoints >= 10) {
            membershipType = new Silver();
        } else {
            membershipType = new Bronze();
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTradingPoints() {
        return tradingPoints;
    }

    public void setTradingPoints(int tradingPoints) {
        this.tradingPoints = tradingPoints;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tradingPoints=" + tradingPoints +
                ", membershipType=" + membershipType +
                '}';
    }


}
