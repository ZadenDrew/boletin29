package empresa_barcos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acabezaslopez
 */
public class Metodos {

    //private Barco b;
    List<Barco> listaBarcos = new ArrayList<>();

    public void crearLista() {
        listaBarcos.add(new Velero(7, "A01258L", 20));
        listaBarcos.add(new Motor(40, "P68473M", 8));
        listaBarcos.add(new Yate(40, 6, "F45687K", 30));
    }

    public void factura(Barco b, int numDias) {

        int prezo = b.calAluguer(b, numDias);

        System.out.println(b.toString() + prezo);

    }
}
