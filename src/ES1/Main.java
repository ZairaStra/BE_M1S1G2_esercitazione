package ES1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String word = scanner.nextLine();
        System.out.println("La parola che hai inserito ha valore " + evenString(word));


        scanner.close();
    }
public static boolean evenString (String word) {
    if (word.length()%2 == 0) {
        return true;
    } else {
        return false;
    }
}

}
