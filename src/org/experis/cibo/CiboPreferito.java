package org.experis.cibo;

public class CiboPreferito {
    public static void main(String[] args) {
        // Definisco l'array
        String[] foodArr = {"Risotto alla crema di scampi", "Pistacchio", "Zabaione", "Panforte", "Castagnaccio", "Pappa al pomodoro"};

        // Stampo la lunghezza dell'array
        System.out.println("La lunghezza della classifica è: " + foodArr.length);
        // Stampo il primo elemento dell'array
        System.out.println("Il mio cibo preferito è: " + foodArr[0]);
        // Stampo l'ultimo elemento dell'array
        System.out.println("L'ultimo della classifica è: " + foodArr[foodArr.length - 1]);
        // Stampo l'elemento che si trova a "metà" dell'array
        System.out.println("Il cibo che si trova a metà della classifica è: " + foodArr[foodArr.length / 2]);
    }
}
