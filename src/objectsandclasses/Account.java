package objectsandclasses;

public class Account {
    private double totalValue;

    public Account(){

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
