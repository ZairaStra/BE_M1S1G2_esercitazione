package ES4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero per visualizzare il relativo conto alla rovescia");
        int numb = Integer.parseInt(scanner.nextLine());
        countdown(numb);
        scanner.close();
    }

    public static void countdown (int numb) {
        for (int i = numb; i >=0 ; i--) {
            System.out.println(i); //stampo il conto alla rovescia, non mi fa usare il return perché è un ciclo for?
        }
    }
}
