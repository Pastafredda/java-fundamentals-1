package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        String nome;
        String cognome;
        String colore;
        int giorno;
        int mese;
        int anno;

        //chiedere all'utente le informazioni
        Scanner scan = new Scanner(System.in);
        // Ottenere nome, cognome e colore preferito dall'utente
        System.out.println("Inserisci il tuo nome");
        nome = scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        cognome = scan.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        colore = scan.nextLine();
        System.out.println("Inserisci il giorno di nascita");
        giorno = scan.nextInt();
        System.out.println("Inserisci il mese di nascita");
        mese = scan.nextInt();
        System.out.println("Inserisci l'anno di nascita ");
        anno = scan.nextInt();

        int sommaData = giorno + mese + anno;

        String password = nome + "-" + cognome + "-" + colore + "-" + sommaData;
        System.out.println("La tua password è" + " " + password);


        scan.close();
    }
}
