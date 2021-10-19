package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is the temperature in fahrenheit?");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        System.out.println(temp);

        System.out.println("What is the temperature in Celsius?");
        double temp2 = (temp - 32) * 5.0/9.0; //formula to get Celcius
        System.out.println(temp2);

        //(fahrenheit - 32) * 5/9 = Celsius
    }
}
