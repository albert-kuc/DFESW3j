package com.qa.main;

import com.qa.dealer.Dealer;

public class Runner {

    public static void main(String[] args) {

        // Define Dealer and deal random cards

        Dealer benny = new Dealer();

        System.out.println(benny.dealCard());
        System.out.println(benny.dealCard());
        System.out.println(benny.dealCard());
        System.out.println(benny.dealCard());
        System.out.println(benny.dealCard());

    }

}
