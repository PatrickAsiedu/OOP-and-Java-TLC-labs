package objectsandclasses;

public class Trader {
    private String name;
    private final Account  account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void addTrade(Trade trade){
        account.setTotalValue( account.getTotalValue()+trade.getPrice()*trade.getQuantity());
    }










}


