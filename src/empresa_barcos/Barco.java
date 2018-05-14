package empresa_barcos;

/**
 *
 * @author acabezaslopez
 */
public abstract class Barco {

    private String matricula;
    private int eslora;

    public Barco() {
    }

    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public int moduloBase() {
        int modulo = eslora * 10;
        return modulo;
    }

    @Override
    public String toString() {
        return ("Barco -> \n matricula=" + matricula + "  eslora=" + eslora + "\t");
    }

    /**
     *
     * @param b
     * @param numDias
     * @return
     */
    public abstract int calAluguer(Barco b, int numDias);
}
