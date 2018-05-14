package empresa_barcos;

/**
 *
 * @author acabezaslopez
 */
public class Empresa_barcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Barco b = new Velero(7, "A01258L", 20);
      
        m.factura(b,3);

    }

}
