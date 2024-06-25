package inheritanceandinterfaces;

import exceptions.TradeIDException;
import objectsandclasses.Trade;

public class BondTrade extends Trade {
    private final double dividend;




    public BondTrade(String id , String symbol, int quantity , double price,double dividend) throws TradeIDException {
        super(id, symbol, quantity, price);
        this.dividend=dividend;

    }

    @Override
    public double calcDividend() {
        return dividend;


    }

    public double getDividend() {
        return dividend;
    }


}
