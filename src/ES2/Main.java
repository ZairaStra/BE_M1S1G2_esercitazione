package ES2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int numb = Integer.parseInt(scanner.nextLine());
        System.out.println("Il numero che hai inserito è: " + stampNumb(numb));

        scanner.close();
    }

public static String stampNumb (int numb) {
// SCORRETTO: NON ACCETTA IL BREAK CON IL RETURN
//    switch (numb) {
//        case 0: return "zero";
//        break;
//        case 1: return "uno";
//        break;
//        case 2: return "due";
//        break;
//        case 3: return "tre";
//        break;
//        default: return "il numero inserito non è valido";
//    }

    //CORRETTO - SENZA BREAK,VERSIONE "LUNGA"
//    switch (numb) {
//        case 0: return "zero";
//        case 1: return "uno";
//        case 2: return "due";
//        case 3: return "tre";
//        default: return "il numero inserito non è valido";
//    }

    return switch (numb) {
        case 0 -> "zero";
        case 1 -> "uno";
        case 2 -> "due";
        case 3 -> "tre";
        default -> "non valido";
    };
}
}