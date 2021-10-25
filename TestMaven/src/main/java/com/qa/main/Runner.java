package com.qa.main;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) throws Exception {

        // the main method requires exactly 3 arguments to be specified in order to run
        System.out.println(args.length);
        if (args.length != 3) {
            throw new Exception("Excatly 3 arguments are required: symbol (+), and 2 integers");
        }

        // print args submitted to the Runner
        System.out.println(Arrays.toString(args));

        // simulate a simple operation by submitting an operator followed by two integers
        // currently only addition is set
        String symbol = args[0];
        int val1 = Integer.parseInt(args[1]);
        int val2 = Integer.parseInt(args[2]);

        System.out.println(symbol.getClass());
        if (symbol.equals("+")) {
            int result = val1 + val2;
            System.out.println(val1 + " + " + val2 + " = " + result);

        }

    }

}

