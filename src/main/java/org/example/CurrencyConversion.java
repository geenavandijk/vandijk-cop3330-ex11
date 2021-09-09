/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion {

    static public void main (String[] args){

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.printf ("How many euros are you exchanging? ");
        float c_frame = input.nextFloat();

        System.out.printf ("What is the exchange rate of the euro?");
        float rate = input.nextFloat();

        float c_to = rate * c_frame;

        df.setRoundingMode (RoundingMode.UP);
        System.out.printf("%.2f euros at an exchange rate of %.4f is "+df.format (c_to)+" U.S. dollars. ",c_frame, rate);

    }
}
