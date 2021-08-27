package arreglos;


public class Asignacion {

    public static void main(String[] args) {
        int[] valores = new int[6];
    
        /* Asignacion manual uno a uno
        valores[0]= 1;
        valores[1]= 2;
        valores[2]= 3;
        valores[3]= 4;
        valores[4]= 5;
        valores[5]= 6;
        
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);
        System.out.println(valores[4]);
        System.out.println(valores[5]);
        */
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i;            
        }
        
        for (int valor : valores) {
            System.out.println(valor);
        }
        
        
    }
    
}
