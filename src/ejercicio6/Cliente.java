package ejercicio6;

/**
 *
 * @author aquinoacordero
 */
public class Cliente extends Thread {

    int cant;
    Transacciones trans; 

    public Cliente() {
    }

    Cliente(int capital) {
        this.cant = capital;
    }

    @Override
    public void run() {
        cant++;
        trans.total();
    }

}
