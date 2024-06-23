package objectsandclasses;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private  LocalDate date;
    private LocalTime time;




    public Trade (String id , String symbol, int quantity , double price){
      this(id , symbol, quantity);
      setPrice(price);


    }

    public Trade (String id , String symbol, int quantity ){
        this.id=id;
        this.symbol=symbol;
        this.quantity=quantity;
        this.date=LocalDate.now();
        this.time=LocalTime.now();
    }

    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");

        }else {
            this.price = price;
        }
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

    public abstract double calcDividend();





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



