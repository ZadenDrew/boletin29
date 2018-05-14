package empresa_barcos;

/**
 *
 * @author acabezaslopez
 */
public class Motor extends Barco {

    private int potencia;
    private int aluguer;

    public Motor() {
    }

    public Motor(int potencia, String matricula, int eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return ("Motor : " + super.toString() + "aluguer=");
    }

    @Override
    public int calAluguer(Barco b, int numDias) {
        int aluger = (b.moduloBase() * numDias) * potencia;
        return aluger;
    }
}
