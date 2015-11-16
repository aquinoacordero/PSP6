package ejercicio6;

/**
 *
 * @author aquinoacordero
 */
class Proveedor extends Thread {

    boolean disponible = false;
    int cant;
    Transacciones trans; 

    public Proveedor() {

    }

    Proveedor(int capital) {
        this.cant = capital;
        if (capital > 0) {
            this.disponible = true;
        }
    }

    @Override
    public void run() {
        if (disponible == true) {
            cant--;
            trans.total();
        }
    }

}
