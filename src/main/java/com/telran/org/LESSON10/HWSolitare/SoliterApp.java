package com.telran.org.LESSON10.HWSolitare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoliterApp {

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);

        List<Card> newDeck = new Soliter().make(deck);

        if (newDeck.size() == 4) {
            System.out.println("Пасьянс сошёлся!");
        } else {
            System.out.println("Пасьянс не сошёлся");
            for (Card card : newDeck) {
                System.out.println(card);
            }
        }
    }
}