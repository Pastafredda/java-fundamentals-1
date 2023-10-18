package org.lessons.java;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BigliettoTreno {
    public static void main(String[] args) {
        int km;
        int eta;
        double prezzo = 0.21;
        int sconto;
        DecimalFormat decimale = new DecimalFormat("#.00");
        //chiedere all'utente il numero di km
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il numero di km da percorrere");
        km = Integer.parseInt(scan.nextLine());
        System.out.println("Hai inserito" + " " + km + "km");
        //chiedere l'età
        System.out.println("inserisci la tua eta");
        eta = Integer.parseInt(scan.nextLine());
        System.out.println("La tua età è" + " " + eta + "anni");
        double prezzoBiglietto = km * prezzo;
        if (eta <18){
            sconto = 20;
        } else if (eta >= 65) {
            sconto = 40;
        }else {
            sconto = 0;
        }

        double scontoBiglietto = prezzoBiglietto * sconto / 100;
        System.out.println("Hai ottenuto uno sconto di " + " " + decimale.format(scontoBiglietto) + "€" + " " + "sul totale di" + " " + decimale.format(prezzoBiglietto) + "€" );

        double prezzoFinale = prezzoBiglietto - scontoBiglietto;
        System.out.println("Il prezzo del tuo bilietto è" + " " + decimale.format(prezzoFinale) + "€");
        scan.close();
    }
}
