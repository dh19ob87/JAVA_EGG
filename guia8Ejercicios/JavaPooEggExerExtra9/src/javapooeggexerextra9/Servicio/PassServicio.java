/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooeggexerextra9.Servicio;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javapooeggexerextra9.Entidad.Pass;

/**
 *
 * @author diego
 */
public class PassServicio {

    public Pass ingresarDatosUsuario() {
        return new Pass(asignarPassword(), "user", 123456789);
    }

    public void nivelSeguridadContrasena(String password) {
        if (regexCoincidencia("[z]", password) >= 1 && regexCoincidencia("[a]", password) >= 2) {
            System.out.println("¡Nivel de seguridad alto!");
        } else if (regexCoincidencia("[a]", password) == 0 && regexCoincidencia("[z]", password) >= 1) {
            System.out.println("¡¡Nivel de seguridad medio!!");
        } else {
            System.out.println("¡¡¡Nivel de seguridad bajo!!!");
        }
    }

    public String asignarPassword() {
        String password = "a123456789";

        if (password.length() == 10) {
            nivelSeguridadContrasena(password);
        } else {
            System.out.println("Error grave de seguridad. Por favor vuelva a intentarlo.");
            System.exit(0);
        }

        return password;
    }

    public void menu(Pass data) {
        int opcion;

        do {
            System.out.println("==== Bienvenido ==== \n 1. Nivel de contraseña \n 2. Modificar contraseña \n 3. Modificar nombre \n 4. Modificar DNI \n 6. Imprimir \n 7. Salir. \n Ingrese la opción: ");
            opcion = new Scanner(System.in).useDelimiter("\n").nextInt();
            switch (opcion) {
                case 1:
                    nivelSeguridadContrasena(data.getPass());
                    break;
                case 2:
                    modificarContrasena(data);
                    break;
                case 3:
                    modificarNombre(data);
                    break;
                case 4:
                    modificarDni(data);
                    break;
                case 5:
                    System.out.println("Hasta pronto.");
                    break;
                case 6:
                    System.out.println(data.toString());
                    break;
                default:
                    System.out.println("Opción no permitida.");
            }
        } while (opcion != 7);

    }

    public void modificarContrasena(Pass data) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la contraseña actual.");
        String password = input.next();

        if (Pattern.matches(data.getPass(), password)) {
            System.out.println("Por favor ingresa la nueva contraseña.");
            data.setPass(input.next());
            System.out.println("Contraseña asignada.");
        } else {
            System.out.println("Operación no permitida. Error de contraseña.");
        }
    }

    public void modificarNombre(Pass data) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la contraseña.");

        if (Pattern.matches(data.getPass(), input.next())) {
            data.setNombre(input.next());
        } else {
            System.out.println("Operación no permitida. Error de contraseña.");
        }
    }

    public void modificarDni(Pass data) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese su contraseña");

        if (Pattern.matches(data.getPass(), input.next())) {
            data.setDni(input.nextInt());
        } else {
            System.out.println("Operación no permitida. Error de contraseña.");
        }
    }

    public int regexCoincidencia(String regex, String text) {
        int coincidencias = 0;
        Pattern patron = Pattern.compile(regex);
        Matcher match = patron.matcher(text);

        while (match.find()) {
            coincidencias++;
        }

        return coincidencias;
    }

    public boolean checkPassword(Pass crypt, String password) {
        return Pattern.matches(crypt.getPass(), password);
    }

}
