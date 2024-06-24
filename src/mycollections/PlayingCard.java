package mycollections;

import java.util.Objects;

public class PlayingCard {
    private final Suit suit;
    private final CardValue value;

    public PlayingCard(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return suit == that.suit && value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}
