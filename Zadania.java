import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
//        //Zadanie1
//
        System.out.println("+-----------------------------+\n" + "|           Jon Snow          |\n" + "|        knows nothing        |");
        System.out.println("+-----------------------------+");
//
//        //Zadanie2
//
        String name="Asia";
        String surname="Panek";
        int studentNumber=24846;
        System.out.println(name + " " + surname + " " + "s" + studentNumber);
//
//        //Zadanie3
//
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz swoje imię i naciśnij ENTER ");
        String studentName = scan.nextLine();
        System.out.println("Wpisz swoje nazwisko i naciśnij ENTER ");
        String studentSurname = scan.nextLine();
        System.out.println("Podaj swój numer studenta bez \"s\" i naciśnij ENTER");
        int number = scan.nextInt();
        System.out.println("Witaj" + " " + studentName + " " + studentSurname + " " + "s" + number);
        scan.close();

        //Zadanie5

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Wprowadź double a i naciśnij ENTER");
        double a = scan2.nextDouble();
        System.out.println("Wprowadź double b i naciśnij ENTER");
        double b = scan2.nextDouble();
        double sum = a + b;
        double difference = a - b;
        double sumOfReciprocals = 1/a + 1/b;
        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Suma odwrotności: " + sumOfReciprocals);
        scan2.close();

        //Zadanie6
        double f = 1;
        double g = ((double) (77 - 37)) / (11 + 3 * 2 - 7);
        double h = ((double) (2 * 6 + 3 * 5)) / (5 * 5 - (7 + 3) * 2);
        System.out.println(f + g + h);

        //Zadanie8

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Wprowadź wartość wejściową x: ");
        double x = scan3.nextDouble();
        boolean setA = x < -4;
        boolean setB = x > 3 && x <= 10;
        boolean setC = x >= -2 && x <= 8;
        boolean result = (setA || setB) && setC;
        System.out.println(result);
    }
}
