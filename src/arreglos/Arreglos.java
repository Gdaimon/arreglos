package arreglos;

public class Arreglos {

    public static void main(String[] args) {
        
        // Forma 1
        //int calificaciones [] = new int[5];
        // Forma 2
        //int[] calificaciones  = new int[5];
        // Forma 3
        int[] calificaciones  = {9,8,5,1,6,9};
        int suma = 0;
        // Forma 1
        /*
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        
        // Error ppro fuera del indice
        for (int i = 0; i <= calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        // Forma 2
        for (int i = 0; i <= calificaciones.length-1; i++) {
            suma += calificaciones[i];
        }
        */
        
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        
        System.out.println(suma);
        
    }
    
}
