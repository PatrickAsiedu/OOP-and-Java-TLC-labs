package objectsandclasses;

import java.util.Arrays;

public class Account {
    private double totalValue;
    private Trade[] trades = new Trade[10];
    private static int index ;

    public Account(){

    }

    public void addTrade (Trade trade){
        trades[index]= trade;
        index++;


    }

    public String getAllTrades(){
        return Arrays.toString(trades);


    }

    public Account(double totalValue) {
        setTotalValue(totalValue);
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }


    @Override
    public String toString() {
        return "Account{" +
                "totalValue=" + totalValue +
                '}';
    }
}
