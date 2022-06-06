package ch.kbw.rw;

public class Zuweisung {
    Bilanz bilanz;

    public Zuweisung(Bilanz bilanz) {
        this.bilanz = bilanz;
    }

    public double Mindestzuweisung() {
        // Überprüft ob gesetzliche_reserven kleiner als 20% des Aktienkapitals ist
        // und ruft die entsprechende Methode auf
        if (bilanz.getGesetzliche_reserven() < (bilanz.getAktienkapital() * 0.2)) {
            return getErsteMindestzuweisung();
        }
        else {
            return getZweiteMindestzuweisung();
        }

    }

    public double getErsteMindestzuweisung() {
        // Erste Mindestzuweisung, wenn gesetzliche Reserven kleiner als 20% des Aktienkapitals sind
        if(((bilanz.getJahresgewinn() * 0.05) + bilanz.getGesetzliche_reserven()) < (bilanz.getAktienkapital() * 0.2)) {
            return (bilanz.getJahresgewinn() * 0.05);
        } else {
            return (bilanz.getAktienkapital() - bilanz.getGesetzliche_reserven());
        }
    }

    public double getZweiteMindestzuweisung() {
        // Erste Mindestzuweisung, wenn gesetzliche Reserven kleiner als 20% des Aktienkapitals sind
        if(((bilanz.getJahresgewinn() * 0.05) + bilanz.getGesetzliche_reserven()) < (bilanz.getAktienkapital() * 0.2)) {
            return (bilanz.getJahresgewinn() * 0.05);
        } else {
            return (bilanz.getAktienkapital() - bilanz.getGesetzliche_reserven());
        }
    }
}
