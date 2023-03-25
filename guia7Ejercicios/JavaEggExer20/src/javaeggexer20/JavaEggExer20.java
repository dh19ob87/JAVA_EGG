/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeggexer20;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class JavaEggExer20 {

    /**
     * @param args the command line arguments
     */
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int matriz [][], filas, posX, posY;
        char opcion = '*';
        posX = posY = 0;
        
        System.out.println("Ingrese la cantidad de filas");
        filas = Integer.parseInt(CONSOLE.readLine());
        
        matriz = new int [filas][filas];
        Arrays.stream(matriz).forEach(a -> Arrays.fill(a, 0));
        imprimir(matriz, filas);
        
        do {
            if(comprobar_magic(matriz, filas)){
                System.out.println("Juego Terminado. Ganaste.");
                break;
            }            
            System.out.println("----- Bienvenido -----");
            System.out.printf("<Constante mágica> = <%d> \n", (int) ((Math.pow(filas, 3) + filas) / 2));
            System.out.println("1. Llenar toda la matriz por filas");
            System.out.println("2. Reiniciar cuadrado");
            System.out.println("------------ Navegar -----------");
            System.out.println("w -> Arriba");
            System.out.println("s -> Abajo");
            System.out.println("d -> Derecha");
            System.out.println("a -> Izquierda");
            System.out.println("x -> Ingresar valor");
            System.out.println("q -> Salir");
            System.out.println("Por favor ingrese una opción: ");
            opcion = CONSOLE.readLine().charAt(0);
            
            switch(opcion){
                case '1':
                    pushMatriz(matriz, filas);
                    break;
                case '2':
                    Arrays.stream(matriz).forEach(a -> Arrays.fill(a, 0));
                    break;
                case 'w':
                    if(posX != 0){
                        posX --;
                        imprimir_cursor(matriz, filas, posX, posY);
                    }else{
                        imprimir(matriz, filas);
                    }
                    break;
                case 's':
                    if(posX != filas-1){
                        posX ++;
                        imprimir_cursor(matriz, filas, posX, posY);
                    }else{
                        imprimir(matriz, filas);
                    }
                    break;
                case 'd':
                    if(posY != filas-1){
                        posY ++;
                        imprimir_cursor(matriz, filas, posX, posY);
                    }else{
                        imprimir(matriz, filas);
                    }
                    break;
                case 'a':
                    if(posY != 0){
                        posY --;
                        imprimir_cursor(matriz, filas, posX, posY);
                    }else{
                        imprimir(matriz, filas);
                    }
                    break;
                case 'x':
                    matriz [posX] [posY] = Integer.parseInt(CONSOLE.readLine());
                    imprimir(matriz, filas);
                    break;
                case 'q':
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Comando no reconocido");
            }
        } while (opcion != 'q');
        
        imprimir_cursor(matriz, filas, 0, 1);
    }
    
    private static void pushMatriz (int [][] matriz, int filas) throws IOException {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.printf("Pos[%d, %d] = ", i, j);
                matriz[i][j] = Integer.parseInt(CONSOLE.readLine());
            }
        }
    }
    
    private static void imprimir (int [][] matriz, int filas){
        for(int [] row : matriz){
            System.out.println(Arrays.toString(row));
        }
    }
    
    private static void imprimir_cursor (int [][] matriz, int items, int fila, int columna){
        for(int i = 0; i < items; i++){
            for(int j = 0; j < items; j++){
                if(i == fila && j == columna){
                    System.out.print(" [ _ ]");
                }else{
                    System.out.printf(" [ %d ] ", matriz[i][j]);
                }
            }
            System.out.println("");
        }
    }
    
    private static boolean comprobar_magic (int [][] matriz, int filas){
        int constanteMagica = (int) ((Math.pow(filas, 3) + filas) / 2);
        boolean itsMagic = true;
        int [] sumatoriaDiagonales = new int [2];
        int [] sumatoriaFilas = new int [filas];
        int [] sumatoriaColumnas = new int [filas];
        
        Arrays.fill(sumatoriaDiagonales, 0);
        Arrays.fill(sumatoriaFilas, 0);
        Arrays.fill(sumatoriaColumnas, 0);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                if(i == j){
                    sumatoriaDiagonales[0] += matriz[i][j];
                }
                
                if(j == (filas - (i + 1))){
                    sumatoriaDiagonales[1] += matriz[i][j];
                }
                
                sumatoriaFilas[i] += matriz[i][j];
                sumatoriaColumnas[i] += matriz[j][i];
            }
        }
        
        System.out.println("-----------------------------");
        System.out.println("Diagonal Principal = " + sumatoriaDiagonales[0]);
        System.out.println("Diagonal Secundaria = " + sumatoriaDiagonales[1]);
        
        for (int i = 0; i < filas; i++) {
            if (i <= 1) {
                if(sumatoriaDiagonales[i] != constanteMagica){
                    itsMagic = false;
                }
            }
            
            if((sumatoriaFilas[i] != constanteMagica) || (sumatoriaColumnas[i] != constanteMagica)){
                    itsMagic = false;
            }
            
            System.out.printf("Fila %d = %d \n", (i+1), sumatoriaFilas[i]);
            System.out.printf("Columna %d = %d \n", (i+1), sumatoriaColumnas[i]);
        }
        
        return itsMagic;
    }
}
