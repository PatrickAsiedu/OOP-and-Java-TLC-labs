package inheritanceandinterfaces;

import exceptions.TradeIDException;
import objectsandclasses.Trade;

public class FundTrade extends Trade {
    private final double dividend;
    private double divpercentage;


    public FundTrade(String id, String symbol, int quantity, double price, double dividend) throws TradeIDException {
        super(id, symbol, quantity, price);
        this.dividend = getPrice() * (divpercentage/100);
    }


    @Override
    public double calcDividend() {
        return getPrice() * (divpercentage/100);
    }
}
