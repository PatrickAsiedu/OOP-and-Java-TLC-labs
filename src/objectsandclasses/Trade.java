package objectsandclasses;

public class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;


    public Trade(){
    }


    public Trade (String id , String symbol, int quantity , double price){
      this(id , symbol, quantity);
      setPrice(price);

    }

    public Trade (String id , String symbol, int quantity ){
        this.id=id;
        this.symbol=symbol;
        this.quantity=quantity;
    }

    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");

        }else {
            this.price = price;
        }
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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



