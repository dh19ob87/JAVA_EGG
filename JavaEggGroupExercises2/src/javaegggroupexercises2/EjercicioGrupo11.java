/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaegggroupexercises2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class EjercicioGrupo11 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        Scanner input = new Scanner(System.in);
//        int operandoA, operandoB, opcion;
//        String sn;
//        opcion = 0;
//        
//        do {
//            
//            System.out.println("Bienvenido");
//            System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir\nPor favor ingrese una opción");
//            opcion = input.nextInt();
//            
//            switch(opcion){
//                case 1:
//                    System.out.println("Por favor ingrese el primer operando");
//                    operandoA = input.nextInt();
//                    System.out.println("Por favor ingrese el segundo operando");
//                    operandoB = input.nextInt();
//                    
//                    System.out.printf("%d + %d = %d \n", operandoA, operandoB, operandoA + operandoB);
//                    break;
//                case 2:
//                    System.out.println("Por favor ingrese el primer operando");
//                    operandoA = input.nextInt();
//                    System.out.println("Por favor ingrese el segundo operando");
//                    operandoB = input.nextInt();
//                    
//                    System.out.printf("%d - %d = %d \n", operandoA, operandoB, operandoA - operandoB);
//                    break;
//                case 3:
//                    System.out.println("Por favor ingrese el primer operando");
//                    operandoA = input.nextInt();
//                    System.out.println("Por favor ingrese el segundo operando");
//                    operandoB = input.nextInt();
//                    
//                    System.out.printf("%d * %d = %d \n", operandoA, operandoB, operandoA * operandoB);
//                    break;
//                case 4:
//                    System.out.println("Por favor ingrese el primer operando");
//                    operandoA = input.nextInt();
//                    System.out.println("Por favor ingrese el segundo operando");
//                    operandoB = input.nextInt();
//                    
//                    if(operandoB == 0){
//                        System.out.println("Operación no permitida.");
//                    }else{
//                        System.out.printf("%d / %d = %d \n", operandoA, operandoB, operandoA / operandoB);
//                    }
//                    break;
//                case 5:
//                    System.out.println("¿Está seguro que desea salir (S/N)?");
//                    sn = input.next();
//                    if(sn.startsWith("N")){
//                        opcion = 0;
//                    }
//                    break;
//                default:
//                    System.out.println("Operación no definida");
//            }
//        } while (opcion != 5);
//    }
    
//    AUTHOR: Francisco Naranjo EGG
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         int op=0,n1,n2;
         String letra = "n";
         
        do{
        System.out.println("Ingrese una opcion: 1 Suma, 2 Resta, 3 Multiplicación, 4 Division, 5 Salir");
        op = leer.nextInt();

        
        
        switch(op){
            
            case 1: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Suma(n1,n2));break;
            
            case 2: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Resta(n1,n2));break;
            
            case 3: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Multi(n1,n2));break;
            
            case 4: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Divi(n1,n2));break;
            
            case 5: System.out.println("Desea salir del Menú?");
            letra = leer.next();
            break;
            
            
            default: System.out.println("Dato incorrecto S/N");break;
            
        }
        
    }while("n".equalsIgnoreCase(letra));
      System.out.println("Ha salido del Menú");     
    }
    
    
    public static int Suma(int n1, int n2){
        
        int resultado = n1 + n2;
return  resultado;
}
      public static int Resta(int n1, int n2){
        
        int resultado = n1 - n2;
return  resultado;
}
    
      public static int Multi(int n1, int n2){
        
        int resultado = n1 * n2;
return  resultado;
}
        public static int Divi(int n1, int n2){
        
        int resultado = n1 / n2;
return  resultado;
}
}
