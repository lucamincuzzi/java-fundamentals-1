package org.experis.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // Inizializzo il risultato da stampare
            String result = "";
            // Gli assegno il valore in iterazione
            result = result + i;

            // In base alle condizioni di divisibilità per 3, 5 o entrambi cambio il valore del risultato
            if(i % 3 == 0 && i % 5 != 0){
                result = "fizz";
            } else if (i % 3 != 0 && i % 5 == 0) {
                result = "buzz";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = "fizzbuzz";
            }

            // Stampo il risultato
            System.out.println(result);
        }
    }
}
