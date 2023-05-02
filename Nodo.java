package proyectolistasimple;

/**
 *
 * @author moviles
 */
public class Nodo {
    private byte dato;
    private Nodo derecha;
    private Nodo izquierda;
    
    //POR DEFAULT, UN NUEVO NODO VA AL FINAL DE LA LISTA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //POR ESO NEXT = NULL
    public Nodo(){
        this.derecha = null;
        this.izquierda= null;
    }

    public Nodo(byte dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(byte dato) {
        this.dato = dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
}
