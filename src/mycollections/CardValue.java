package mycollections;

public enum CardValue {
    TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'),
    SEVEN('7'), EIGHT('8'), NINE('9'), TEN('T'),
    JACK('J'), QUEEN('Q'), KING('K'), ACE('A');

    private final char symbol;

    CardValue( char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
