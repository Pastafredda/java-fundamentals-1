package org.lessons.java;
import java.util.Scanner;
public class FestaFerragnez {
    public static void main(String[] args) {
        //creare un array con la lista di invitati
        String[] invitati={"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        //inizializzare una variabile per il nome utente
        String nomeUtente;
        // chiedere all'utente come si chiama
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome");
        nomeUtente = scan.nextLine();
        System.out.println("il nome che hai inserito è" + " " + nomeUtente);
        //setto una variabile booleana
        boolean found = false;
        //creare un ciclo che verica per ogni nome sulla lista se il nome utente corrisponde
        for (int i = 0; i < invitati.length ; i++) {
            if (invitati[i].equals(nomeUtente)) {
                found = true;
                System.out.println("Il tuo nome è in lista, puoi entrare");
                break;
            }
        }
        //fare in modo che restituisca una sola volta la risposta negativa
            if(!found) {
                System.out.println("Ci dispiace ma non sei in lista");
            }
        scan.close();
    }

}
