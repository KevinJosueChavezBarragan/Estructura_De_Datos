package proyectolistasimple;

/**
 *
 * @authors 
 * Kevin Josue Chavez Barragan
 * Yahir Gerardo Quezada Romero
 * Jose Ivan Ramirez Romero
 */
public class ListaS {
    
    NodoS inicio;
    NodoS fin;
    int cont;

    public ListaS() {
        inicio = null;
    }
    
    public void agregar(byte valor) {
        NodoS nuevoNodo = new NodoS(valor);

        //VERIFICAR SI HAY NODOS EN LA LISTA
        if (inicio == null) { //no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {//Hay nodos en la lista
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL
            //HASTA EL ULTIMO NODO DE LA LISTA
            //Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            //while(temp.getSiguiente() != null){
            //  temp = temp.getSiguiente();
            //}
            //temp.setSiguiente(nuevoNodo);
            fin.setSigui(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }
}
