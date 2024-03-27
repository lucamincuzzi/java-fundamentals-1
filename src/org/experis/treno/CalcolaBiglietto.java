package org.experis.treno;

import java.util.Scanner;
public class CalcolaBiglietto {
    public static void main(String[] args) {
        // Istanzio la classe Scanner
        Scanner scan = new Scanner(System.in);

        // Chiedo all'utente il numero di chilometri da percorrere
        System.out.print("Quanti chilometri devi percorrere? ");
        int kilometers = scan.nextInt();
        // Chiedo all'utente la sua età
        System.out.print("Quanti anni hai? ");
        int userAge = scan.nextInt();

        // Stabilisco il prezzo del biglietto per kilometro
        final double ticketPricePerKm = 0.21;

        // Definisco lo sconto in base all'età fornita
        int discount = 0;
        if(userAge < 18){
            discount = 20;
        } else if(userAge >= 65) {
            discount = 40;
        }

        // Calcolo il prezzo del biglietto
        double finalTicketPrice = ticketPricePerKm * kilometers;
        if(discount != 0) {
            double ticketPrice = ticketPricePerKm * kilometers;
            finalTicketPrice = ticketPrice - ((ticketPrice / 100) * discount);
        }

        // Comunico il prezzo del biglietto
        System.out.println("Il prezzo del tuo biglietto è di: " + finalTicketPrice + "€");

        // Chiudo lo scanner
        scan.close();
    }
}
