package ch.kbw.rw;

public class Zuweisung {
    Bilanz bilanz;
    String zuweisung;

    public Zuweisung(Bilanz bilanz) {
        this.bilanz = bilanz;
    }

    // Überprüft ob gesetzliche_reserven kleiner als 20% des Aktienkapitals ist und ruft die entsprechende Methode auf
    private double Mindestzuweisung() {
        if (bilanz.getGesetzliche_reserven() < (bilanz.getAktienkapital() * 0.2)) {
            return getErsteMindestzuweisung();
        }
        else {
            return getZweiteMindestzuweisung();
        }

    }
    
    // Erste Mindestzuweisung, wenn gesetzliche Reserven kleiner als 20% des Aktienkapitals entsprechen
    private double getErsteMindestzuweisung() {
        if(((bilanz.getJahresgewinn() * 0.05) + bilanz.getGesetzliche_reserven()) < (bilanz.getAktienkapital() * 0.2)) {
            zuweisung = " (1. Zuweisung)";
            return (bilanz.getJahresgewinn() * 0.05);
        } else { 
            zuweisung = " (1. Zuweisung)";
            return (bilanz.getAktienkapital() - bilanz.getGesetzliche_reserven());
        }
    }

    // Zweite Mindestzuweisung, wenn gesetzliche Reserven mindestens 20% des Aktienkapitals entsprechen
    private double getZweiteMindestzuweisung() {
        if(bilanz.getAktienkapital() * 0.05 < bilanz.getDividende()){
            zuweisung = " (2. Zuweisung)";
            return ((bilanz.getDividende() + bilanz.getTantieme()) - (bilanz.getAktienkapital() * 0.05)) * 0.1;
        } else{
            zuweisung = " (2. Zuweisung)";
            return 0;
        }
    }

    // Ausgabemethode
    public void printZuweisung() {
        System.out.println("Jahresgewinn: " + bilanz.getJahresgewinn());
        System.out.println("Aktienkapital: " + bilanz.getAktienkapital());
        System.out.println("Gesetzliche Reserven: " + bilanz.getGesetzliche_reserven());
        System.out.println("Dividende: " + bilanz.getDividende());
        System.out.println("Tantieme: " + bilanz.getTantieme());
        System.out.println("Mindestzuweisung: " + Mindestzuweisung() + zuweisung);
    }
}
