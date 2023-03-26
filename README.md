# JAVA_WAY
Programas en JAVA formación con EGG

## Bienvenido

Espero este mensaje te encuentre bien. Gracias por interesarte en consultar mi repositorio. Por favor siéntete libre de contactarme para hacerme saber de errores, validaciones, mejoras, problemas en mi código o dudas. **Así me ayudas muchísimo a mejorar**.

### Mi motivación

Mi principal motivación es mejorar mis habilidades de comunicación y coordinación con el equipo de trabajo. Puede parecer que no son esas dos mi mayor debilidad, pero lo son. Tengo tres modos: Hablo lo normal, monosílabos y silencio absoluto. O sea, tengo tres modos de Feedback: Verbose, concise y silence; silence by default. 😂

#### DISCORD

**dh19ob87**

## Rama con proyectos

La rama que tiene los proyectos es **master**.

## Ejercicios de introducción a POO

branch master -> JavaEggPoo

## Para compañeros de Egg

A veces uso un método de lectura de datos por Consola que no es familiar en las primeras lecciones de Egg. Puedes remplazar los imports y las declaraciones:
 ```
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 ...
 private static final BufferedReader CONSOLE = new BufferedReader(new InputStramReader(System.in));
 ...
 <tipo de dato> var = Integer.parseInt(CONSOLE.readLine());
 ```
 
 Por el que nos enseñan en la capacitación:
 
 ```
 import java.util.Scanner;
 ...
 Scanner input = new Scanner(System.in);
 ...
 <tipo de dato> var = input.nextInt(); //O la función que sea pertinente
 ```
 
 Y retirar de las funciones la declaración:
 
 ```
 <nombre funcion> (<parámetros>) throws IOException // <- Borra throws IOException
 ```
