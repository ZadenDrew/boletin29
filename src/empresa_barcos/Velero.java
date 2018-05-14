package empresa_barcos;

/**
 *
 * @author acabezaslopez
 */
public class Velero extends Barco {

    private int numastiles;
    private int aluguer;

    public Velero() {
    }

    public Velero(int numastiles, String matricula, int eslora) {
        super(matricula, eslora);
        this.numastiles = numastiles;
    }

    public int getNumastiles() {
        return numastiles;
    }

    public void setNumastiles(int numastiles) {
        this.numastiles = numastiles;
    }

    @Override
    public String toString() {
        return ("Velero : " + super.toString() + "aluguer=" );
    }

    @Override
    public int calAluguer(Barco b, int numDias) {
        int aluger = (b.moduloBase() * numDias * numastiles);
        return aluger;
    }

}
