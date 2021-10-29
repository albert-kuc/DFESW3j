package com.qa.dealer;

import com.qa.card.Card;
import com.qa.card.Rank;
import com.qa.card.Suit;

import java.util.Random;

public class Dealer {

    public Card dealCard() {

        Rank rank = Rank.values()[new Random().nextInt(Rank.values().length)];
        Suit suit = Suit.values()[new Random().nextInt(Suit.values().length)];

        return new Card(rank, suit);
    }

}
