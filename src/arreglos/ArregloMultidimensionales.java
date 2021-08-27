package arreglos;

public class ArregloMultidimensionales {

    public static void main(String[] args) {
        // Creacion y asignacion
        
        int[][] matriz = new int[4][3];
        
        /* Forma 1
        // x = 0, y = 0
        // Asignacion
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        // Obtener valores
        System.out.println(matriz[2][2]);
        */
        
        /*
        // Opcion 2
        for(int posX = 0; posX < matriz.length; posX++){
            for(int posY = 0; posY < matriz[posX].length; posY++){
                matriz[posX][posY] = posY*2;
            }
        }
        */
        /*
        for(int[] fila:matriz){
            for(int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
        */
        
        /*
        for(int posX = 0; posX < matriz.length; posX++){

         //   if(posX == 1){
         //       break;
         //   }

            
            
         //   if(posX == 1){
         //       continue;
         //   }
                       
            
            for(int posY = 0; posY < matriz[posX].length; posY++){
                System.out.print(matriz[posX][posY] + " ");
            }
            System.out.println("Fila " + posX);
        }
    */
        
        int[][] calificaciones = new int[5][];
        
        calificaciones[0] = new int[1];
        calificaciones[1] = new int[2];
        calificaciones[2] = new int[3];
        calificaciones[3] = new int[4];
        calificaciones[4] = new int[5];
        
        calificaciones[0][0] = 1;
        
        calificaciones[1][0] = 2;
        calificaciones[1][1] = 2;
        
        calificaciones[2][0] = 3;
        calificaciones[2][1] = 3;
        calificaciones[2][2] = 3;
        
        calificaciones[3][0] = 4;
        calificaciones[3][1] = 4;
        calificaciones[3][2] = 4;
        calificaciones[3][3] = 4;
        
        calificaciones[4][0] = 5;
        calificaciones[4][1] = 5;
        calificaciones[4][2] = 5;
        calificaciones[4][3] = 5;
        calificaciones[4][4] = 5;
        
        for(int[] fila : calificaciones){
            for(int celda : fila){
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
    
    
}
