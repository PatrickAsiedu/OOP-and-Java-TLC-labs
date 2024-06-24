package test;

import mycollections.PlayingCard;
import org.junit.Test;
import mycollections.Suit;
import mycollections.CardValue;


import static org.junit.jupiter.api.Assertions.*;

public class PlayingCardTest {
    @Test
    public void testCardEquality() {
        PlayingCard card1 = new PlayingCard(Suit.SPADES, CardValue.ACE);
        PlayingCard card2 = new PlayingCard(Suit.SPADES, CardValue.ACE);
        PlayingCard card3 = new PlayingCard(Suit.DIAMONDS, CardValue.ACE);

        assertEquals(card1, card2, "Cards with the same suit and CardValue should be equal");
        assertNotEquals(card1, card3, "Cards with different suits should not be equal");
    }

}