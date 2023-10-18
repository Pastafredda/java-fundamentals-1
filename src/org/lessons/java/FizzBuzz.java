package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {
        //creare un ciclo per stampare da 1 a 100 numeri
        for (int i = 1; i <= 100; i++) {
            //se i numeri sono sia multipli di 3 che di 5 stampare fizzbuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
                //se i numeri sono multipli di 3 stampare fizz
            } else if (i % 3 == 0) {
                System.out.println("fizz");
                //se i numeri sono multipli di 5 stampate buzz
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                //altrimenti stampa i numeri
            } else {
                System.out.println(i);
            }
        }
    }
}
