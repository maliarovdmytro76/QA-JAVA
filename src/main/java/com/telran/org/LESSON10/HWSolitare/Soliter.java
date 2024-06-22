package com.telran.org.LESSON10.HWSolitare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Soliter {

    public List<Card> make(List<Card> deck) {
        List<Card> newDeck = new ArrayList<>();
        Map<Rank, Integer> rankCounts = new HashMap<>();

        for (Card card : deck) {
            rankCounts.put(card.getRank(), rankCounts.getOrDefault(card.getRank(), 0) + 1);
            if (rankCounts.get(card.getRank()) == 4) {
                for (Card c : deck) {
                    if (c.getRank() == card.getRank()) {
                        newDeck.add(c);
                    }
                }
                break;
            }
        }

        return newDeck.size() == 4 ? newDeck : deck;
    }
}
