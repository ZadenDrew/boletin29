package empresa_barcos;

/**
 *
 * @author acabezaslopez
 */
public class Yate extends Barco {

    private int potencia, numcamarotes;
    int aluguer;

    public Yate() {
    }

    public Yate(int potencia, int numcamarotes, String matricula, int eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.numcamarotes = numcamarotes;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumcamarotes() {
        return numcamarotes;
    }

    public void setNumcamarotes(int numcamarotes) {
        this.numcamarotes = numcamarotes;
    }

    @Override
    public String toString() {
        return ("Yate : " + super.toString() + "aluguer=" );
    }

    @Override
    public int calAluguer(Barco b, int numDias) {
        int aluger = (b.moduloBase() * numDias) * numcamarotes * potencia;
        return aluger;
    }
}
