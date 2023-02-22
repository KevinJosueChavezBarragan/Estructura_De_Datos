package arreglo;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dato[] = new int[10];
        
        for (int i = 0; i < dato.length; i++) {
            System.out.println("Ingresa el valor para: [" + i + "]");
            dato[i] = leer.nextInt();
        }
        for (int i = 0; i < dato.length; i++) {
            System.out.println("Los valores son [" + i + "]:" + "[" + dato[i] + "]");
        }
    }
    
}
