/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Servicio;

import guia10extra4.Entidad.Alumno;
import guia10extra4.Entidad.Voto;
import guia10extra4.Utilidades.RandomUser;
import guia10extra4.Utilidades.Comparadores;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Collections;

/**
 *
 * @author diego
 */
public class SimuladorServicio {

    public void iniciarSimulacion() {
        VotoServicio voteService = new VotoServicio();
        LinkedList<Voto> resultadoElecciones = new LinkedList<>();
        System.out.println("Bienvenido. Por favor ingrese la cantidad de alumnos con los que quiere realizar la simulación:");
        LinkedList<Alumno> electores = RandomUser.getUsuarios(new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US).nextInt());
        if (electores.isEmpty()) {
            System.out.println("Lo sentimos algo ha salido mal con la conexión al servicio. Por favor inténtelo de nuevo.");
        } else {
            electores.forEach(elector -> resultadoElecciones.add(voteService.crearVoto(elector)));
            System.out.printf("<<<<<CANTIDAD DE ELECTORES REGISTRADOS: %d>>>>>\n\n", electores.size());
            votacionAleatoria(electores, resultadoElecciones);
        }
    }

    private void votacionAleatoria(LinkedList<Alumno> electores, LinkedList<Voto> candidatos) {
        Random votoAleatorio = new Random();
        int cantidadElectores = electores.size();
        int candidatoElegido = 0;

        for (int i = 0; i < cantidadElectores; i++) {
            int votosEjercidos = 0;
            while (votosEjercidos < 3) {
                candidatoElegido = votoAleatorio.nextInt(cantidadElectores);
                while (candidatoElegido == i) {
                    candidatoElegido = votoAleatorio.nextInt(cantidadElectores);
                }
//                System.out.println(candidatos.get(candidatoElegido).getStudent());
//                System.out.println(electores.get(candidatoElegido));
//                System.out.println(candidatos.get(candidatoElegido).getVotosOtorgados().contains(electores.get(candidatoElegido)));
                Long idCandidatoAVotar = electores.get(candidatoElegido).getDni();

                if (candidatos.get(i).getVotosOtorgados().stream().anyMatch(elector -> Objects.equals(elector.getDni(), idCandidatoAVotar))) {
                    System.out.println("No puedes votar dos veces por el mismo candidato. Intenta de nuevo.");
                } else {
                    votosEjercidos++;
                    candidatos.get(i).getVotosOtorgados().add(electores.get(candidatoElegido));
                    int posicionCandidatoElegido = candidatoElegido;
                    Alumno elegido = candidatos.stream().filter(candidato -> candidato.getStudent().equals(electores.get(posicionCandidatoElegido))).findFirst().get().getStudent();
                    elegido.setVotosObtenidos(elegido.getVotosObtenidos() + 1);
                }
            }
        }

        imprimirResultadoElecciones(candidatos);
        System.out.println("======================RECUENTO======================");
        recuentoDeVotos(candidatos);
        System.out.println("======================FELICITACIONES A LOS FACILITADORES======================");
        facilitadoresYSupletes(candidatos);
    }

    private void imprimirResultadoElecciones(LinkedList<Voto> candidatos) {
        candidatos.forEach(candidato -> {
            System.out.println("============================================");
            System.out.println(candidato.getStudent().getApeliido() + " " + candidato.getStudent().getNombre() + " " + candidato.getStudent().getDni());
            System.out.println("***********************************************************************");
            candidato.getVotosOtorgados().forEach(System.out::println);
            System.out.println("***********************************************************************");
        });
    }

    private void recuentoDeVotos(LinkedList<Voto> resultadoElecciones) {
        int totalVotos = 0;
        for (Voto sufragio : resultadoElecciones) {
            totalVotos += sufragio.getStudent().getVotosObtenidos();
        }
        System.out.println("\n RESULTADO RECUENTO ELECCIONES");
        System.out.println("<Total electores>: " + resultadoElecciones.size());
        System.out.println("<Total votos: > " + totalVotos);
    }

    private void facilitadoresYSupletes(LinkedList<Voto> resultadoElecciones) {
        Collections.sort(resultadoElecciones, Comparadores.ordenarEleccionesDesc.reversed());
        resultadoElecciones.forEach(elemento -> System.out.printf("%s %s | Votos obtenidos: %d\n", elemento.getStudent().getApeliido(), elemento.getStudent().getNombre(), elemento.getStudent().getVotosObtenidos()));
        if (resultadoElecciones.size() < 10) {
            System.out.println("\n¡¡¡¡¡¡¡¡No hay suficientes alumnos registrados para darte 5 facilitadores y 5 suplentes!!!!!!!!!");
        } else {
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    System.out.println("\nFacilitadores líder:\n");
                } else if (i == 5) {
                    System.out.println("\nFacilitadores suplentes:\n");
                }
                System.out.printf("%s %s | Votos obtenidos: %d\n", resultadoElecciones.get(i).getStudent().getApeliido(), resultadoElecciones.get(i).getStudent().getNombre(), resultadoElecciones.get(i).getStudent().getVotosObtenidos());
            }
        }
    }
}
