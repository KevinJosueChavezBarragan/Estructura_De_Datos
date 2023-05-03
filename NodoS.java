package proyectolistasimple;

/**
 *
 * @authors 
 * Kevin Josue Chavez Barragan
 * Yahir Gerardo Quezada Romero
 * Jose Ivan Ramirez Romero
 */
public class NodoS {
    byte info;
    NodoS sigui;

    public NodoS(byte info) {
        this.info = info;
        sigui = null;
    }

    public byte getInfo() {
        return info;
    }

    public void setInfo(byte info) {
        this.info = info;
    }

    public NodoS getSigui() {
        return sigui;
    }

    public void setSigui(NodoS sigui) {
        this.sigui = sigui;
    }
    
    
}
