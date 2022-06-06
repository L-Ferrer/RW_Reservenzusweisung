package ch.kbw.rw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parameters
        System.out.print("Geben Sie den Jahresgewinn ein: ");
        double jahresgewinn = scanner.nextDouble();
        System.out.print("Geben Sie das Aktienkapital ein: ");
        double aktienkapital = scanner.nextDouble();
        System.out.print("Geben Sie die gesetzliche Reserven ein: ");
        double gesetzliche_reserven = scanner.nextDouble();
        
        // Create Zuweisung object
        Bilanz bilanz = new Bilanz(jahresgewinn, aktienkapital, gesetzliche_reserven);
        Zuweisung zuweisung = new Zuweisung(bilanz);

        // Ausgabemethoden
        System.out.println("Mindestzuweisung: " + zuweisung.Mindestzuweisung());
    }
}
