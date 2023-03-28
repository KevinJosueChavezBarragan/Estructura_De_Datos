/**
 *
 * @author Kevin Josue Chavez Barragan
 * Fecha de creacion: 28/03/2023
 */
public class Factorial {
    
    public long factorialIterativo(byte n){
        long f = 1;
        for (int i = n; i > 1; i--) 
            f = f * i;
        
        return f;
    }
    
    public long factorialRecursivo (byte n){
        if(n == 0)
            return 1;
        else
            return n * factorialRecursivo((n - 1);
    }
}
