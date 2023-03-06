/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Josue Chavez Barragan Fecha de creacion: 06/03/23
 */
public class Lista {
//Atributos

    private String lista[];
    private byte numElem, tamaño;

//Metodos
/*
     Metodo constructor:
     - El metodo constructor siempre se llama igual que la clase
     - Es el metodo que inicializa los vcalores de los atributos
     - Es el metodo que mando a llamar para reservar memoria a un objeto
     - Es el unico metodo que no lleva tipo de valor de retorno
     */
    //Constructor default o por defecto
    public Lista() {
        numElem = 0;
        tamaño = 5;
        lista = new String[tamaño];
    }

    public Lista(byte tamaño) {
        numElem = 0;
        this.tamaño = tamaño;
        lista = new String[tamaño];
    }

    public byte getNumElem() {
        return numElem;
    }

    public byte getTamaño() {
        return tamaño;
    }

    public void setNumElem(byte numElem) {
        this.numElem = numElem;
    }

    public void setTamaño(byte tamaño) {
        this.tamaño = tamaño;
    }

}
