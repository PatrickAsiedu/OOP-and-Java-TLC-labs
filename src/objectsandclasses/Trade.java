package objectsandclasses;

public class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

    public Trade (String id , String symbol, int quantity ){
        this.id=id;
        this.symbol=symbol;
        this.quantity=quantity;
    }





    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}



