package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Calculates money exchange from euros to dollars
        System.out.print("How many euros are you exchanging? ");
        double euroAmt = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();

        double total = euroAmt * exchangeRate;

        System.out.format("%.0f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euroAmt, exchangeRate, total);
    }
}
