package org.example.lesson14.blackjack;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand {

    private List<Card> cards;

    public BlackJackHand() {
        cards = new ArrayList<>();
    }

    public int getValue() {
        return 0; //TODO implement logic
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackJack() {
        return getValue() == 21 && cards.size() == 2;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
