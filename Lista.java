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

    public void setNumElem(byte numElem) {
        this.numElem = numElem;
    }

    public byte getTamaño() {
        return tamaño;
    }

    public void setTamaño(byte tamaño) {
        this.tamaño = tamaño;
    }

    public boolean agregarElemento(String valor){
        if (numElem < tamaño){
            lista[numElem] = valor;
            numElem++;
            return true;
        }else
            return false;
    }
    
    public String obtenerElemento(){
        String cadena = "";
        
        for (byte i = 0; i < numElem; i++) 
            if(i<(numElem-1))
              cadena += lista[i] + ", \n";
            else
                cadena += lista[i];
        return cadena;
    }
    
    public boolean borrarElementos(){
        if(numElem>0){
            numElem--;
        }
        return true;
    }
}
