package ES1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.1
        System.out.println("Inserisci una parola");
        String word = scanner.nextLine();
        System.out.println("La parola che hai inserito ha un numero di caratteri pari: " + evenString(word));

        //1.2
        System.out.println("Inserisci un anno");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("L'anno che hai inserito è bisestile: " + leapYear(year));

        scanner.close();
    }

    //1.1 metodo
    //public static boolean evenString (String word) {
    //    if (word.length()%2 == 0) {
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}
    public static boolean evenString (String word) {
        return word.length() % 2 == 0;
    }

    //1.2 metodo
//    public static boolean leapYear (int year) {
//        if (year%4==0) {
//            if (year%100==0 && year%400==0) {
//                return true;
//            } else {
//                return  false;
//            }
//        }else {
//            return false;
//    }
    public static boolean leapYear (int year) {
        if (year%4==0) {
            if (year%100==0) {
                return year%400==0;
            } else {
                return true;
            }
        }else {
            return false;
    }



    }

    }
