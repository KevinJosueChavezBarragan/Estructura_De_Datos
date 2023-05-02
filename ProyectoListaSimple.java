package proyectolistasimple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class ProyectoListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaS miLista = new ListaS();
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        miLista.agregar(50);
        miLista.agregar(60);
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.agregarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //for (int i = 0; i < 1000000; i++) {
        // miLista.agregar(1000);
        //}
        //System.out.println("Conteo de nodos: " + miLista.tamaLista());
        try {
            miLista.borrarEn(3);
        } catch (Exception ex) {
            Logger.getLogger(ProyectoListaSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        //miLista.vaciarLista();
        miLista.imprimir();
        try {
            System.out.println("Valor en la posicion 4 es: " + miLista.obtenerValorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(ProyectoListaSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
