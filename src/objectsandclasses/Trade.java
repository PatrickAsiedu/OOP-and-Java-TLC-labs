package objectsandclasses;

import exceptions.TradeIDException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public abstract class Trade {
    private static Set<String> ids = new HashSet<>();
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private  LocalDate date;
    private LocalTime time;




    public Trade (String id , String symbol, int quantity , double price) throws TradeIDException {
      this(id , symbol, quantity);
      setPrice(price);


    }

    public Trade (String id , String symbol, int quantity ) throws TradeIDException {
        if(ids.contains(id)){
            throw new TradeIDException("Trade Id EXists");

        }else {
            ids.add(id);
            this.id=id;
        }

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



