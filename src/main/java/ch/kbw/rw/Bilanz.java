package ch.kbw.rw;

public class Bilanz {
    double jahresgewinn;
    double aktienkapital;
    double gesetzliche_reserven;

    public Bilanz(double jahresgewinn, double aktienkapital, double gesetzliche_reserven) {
        this.jahresgewinn = jahresgewinn;
        this.aktienkapital = aktienkapital;
        this.gesetzliche_reserven = gesetzliche_reserven;
    }

    public double getJahresgewinn() {
        return this.jahresgewinn;
    }
    public double getAktienkapital() {
        return this.aktienkapital;
    }
    public double getGesetzliche_reserven() {
        return this.gesetzliche_reserven;
    }
}
