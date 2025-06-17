package ES3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word; // devo dichiararla fuori dal ciclo per usarla nel while

        do {
            System.out.println("Inserisci una parola, :q per terminare");
            word = scanner.nextLine();

            if (!word.equals(":q")) {
                System.out.println("La parola che hai inserito è composta dai caratteri: " + singleChar(word));
            }

        } while (!word.equals(":q"));

        scanner.close();
    }

    public static String singleChar(String word) {
        String[] chars = word.split("");
       return Arrays.toString(chars); //uso lo split come in js, ma ottengo un array di caratteri
        //        return String.join(",", chars); // questo metodo converte l'array di caratteri, unendoli in una stringa separata da virgola
    }
}
