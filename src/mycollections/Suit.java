package mycollections;

public enum Suit {
    SPADES('S'), DIAMONDS('D'), CLUBS('C'), HEARTS('H');

    private final char symbol;

    Suit( char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
