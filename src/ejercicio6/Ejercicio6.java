package ejercicio6;

/**
 *
 * @author aquinoacordero
 */
public class Ejercicio6 extends Thread implements Runnable {

    public static void main(String[] args) {
        int capital = 10;
        
        Thread Cliente = new Cliente(capital);
        Thread Proveedor = new Proveedor(capital);
        Cliente.start();
        Proveedor.start();
        
    }

}
