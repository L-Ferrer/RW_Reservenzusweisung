package ch.kbw.rw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                // Input parameters
                System.out.print("Geben Sie den Jahresgewinn ein: ");
                double jahresgewinn = scanner.nextDouble();
                System.out.print("Geben Sie das Aktienkapital ein: ");
                double aktienkapital = scanner.nextDouble();
                System.out.print("Geben Sie die gesetzliche Reserven ein: ");
                double gesetzliche_reserven = scanner.nextDouble();
                System.out.print("Geben Sie die Dividende ein: ");
                double dividende = scanner.nextDouble();
                System.out.print("Geben Sie die Tantieme ein: ");
                double tantieme = scanner.nextDouble();
                
                // Erstellung des 'Zuweisung' object
                Bilanz bilanz = new Bilanz(jahresgewinn, aktienkapital, gesetzliche_reserven, dividende, tantieme);
                Zuweisung zuweisung = new Zuweisung(bilanz);

                // Ausgabemethoden
                zuweisung.printZuweisung();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
