package ch.kbw.rw;

public class Bilanz {
    double jahresgewinn;
    double aktienkapital;
    double gesetzliche_reserven;
    double dividende;
    double tantieme;

    public Bilanz(double jahresgewinn, double aktienkapital, double gesetzliche_reserven, double dividende, double tantieme) {
        this.jahresgewinn = jahresgewinn;
        this.aktienkapital = aktienkapital;
        this.gesetzliche_reserven = gesetzliche_reserven;
        this.dividende = dividende;
        this.tantieme = tantieme;
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
    public double getDividende() {
        return this.dividende;
    }
    public double getTantieme() {
        return this.tantieme;
    }
}
