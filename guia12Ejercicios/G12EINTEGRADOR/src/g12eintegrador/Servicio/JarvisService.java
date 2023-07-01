/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Servicio;

import g12eintegrador.Entidad.Armadura;
import g12eintegrador.Entidad.Fani;
import g12eintegrador.Entidad.Jarvis;
import g12eintegrador.Comparadores.Comparador;
import g12eintegrador.Interfaces.CoordenadasCartesianas;
import g12eintegrador.Interfaces.CoordenadasEsfericas;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JarvisService {

    private static final DecimalFormat df = new DecimalFormat("#.##");
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static ArrayList<String> mensajes = new ArrayList<>();
    private static ArmaduraServicio as = new ArmaduraServicio();
    private static FaniServicio fs = new FaniServicio();

    public Jarvis crearJarvis() {
        return new Jarvis(as.crearArmadura(), fs.crearListaDeFanis());
    }

    public void eliminarNoHostiles(List<Fani> listaDeFanis) {
        Iterator<Fani> iter = listaDeFanis.iterator();

        while (iter.hasNext()) {
            Fani next = iter.next();
            if (!next.isHostil()) {
                iter.remove();
            }
        }
    }

    /**
     * ordena los fani de menor a mayor distancia elimina los fani no hostiles
     *
     * @param listaDeFanis
     */
    public void operarRadar(List<Fani> listaDeFanis) {
        listaDeFanis.sort(Comparador.ordenarFanisPorDistanciaAsc);
        eliminarNoHostiles(listaDeFanis);
    }

    public String informacionFaniHostiles(List<Fani> listaFaniHostiles) {
        StringBuilder mensaje = new StringBuilder();

        listaFaniHostiles.forEach(fani -> {
            mensaje.append("\n======================\n");
            mensaje.append("Tipo de F.A.N.I. -> ").append(fani.getMovimiento()).append("\n");
            mensaje.append("Energía -> ").append(fani.getEnergia()).append("\n");
            mensaje.append("Dureza -> ").append(fani.getDureza()).append("\n");
            mensaje.append("Distancia de ataque -> ").append(fani.getDistanciaAtaque()).append("\n");
            mensaje.append("Potencia de ataque -> ").append(fani.getPotenciaDeAtaque()).append("\n");
            mensaje.append("Coordenadas cartesianas -> x: ").append(fani.getX()).append(" km | y: ").append(fani.getY()).append(" km | z: ").append(fani.getZ()).append(" km\n");
            mensaje.append("Coordenadas esféricas : ").append("rho: ").append(df.format(CoordenadasEsfericas.calcularVectorRho(fani.getX(), fani.getY(), fani.getZ())))
                    .append("km | <- theta ->: ").append(df.format(CoordenadasEsfericas.calculaAnguloTheta(fani.getX(), fani.getY())))
                    .append("° | v varphi ^: ").append(df.format(CoordenadasEsfericas.calcularAnguloVarphi(fani.getX(), fani.getY(), fani.getZ()))).append("°\n");
            mensaje.append("Distancia en km -> ").append(df.format(CoordenadasCartesianas.calcularDistanciaMedianteModuloVector(fani.getX(), fani.getY(), fani.getZ()))).append(" km\n");
            mensaje.append("======================\n");
        });

        return mensaje.toString();
    }

    public void monitorearArmadura(Armadura ironman) {
        limpiarFifoMensajes();

        mensajes.add("============== Iniciando monitoreo de la armadura ==============\n");
        mensajes.add("Tony, este es el estado de la armadura \n");
        ironman.getPartesArmadura().stream().forEach(parte -> {
            mensajes.add(parte.getNombreParte() + " -> " + ((parte.isEstadoParte()) ? "Fucionando" : "Averiado"));
        });

        escribirEnConsola(ironman, mensajes.stream().toArray(String[]::new));
        System.out.println("");
    }

    public void informeReactor(Armadura ironman) {
        limpiarFifoMensajes();
        mensajes.add("============== Estado del reactor ============== \n");
        mensajes.add("Tony, este es el estado del reactor");
        mensajes.add("Estado reactor -> " + ((ironman.getPartesArmadura().stream().filter(parte -> parte.getNombreParte().toString().equalsIgnoreCase("reactor")).findFirst().get().isEstadoParte()) ? "Funcionando" : "Averiado"));
        mensajes.add("Energía del reactor -> " + as.imprimirEnergiaEnPorcentaje(ironman.getEnergia()));
        mensajes.add(as.imprimirEnergiaEnJoules(ironman.getEnergia()));
        mensajes.add(as.imprimirEnergiaEnWattioHora(ironman.getEnergia()) + "\n");
        escribirEnConsola(ironman, mensajes.stream().toArray(String[]::new));
        System.out.println("");
    }

    public void informeDamage(Armadura ironman) {
        limpiarFifoMensajes();
        int totalPartesDamaged = (int) ironman.getPartesArmadura().stream().filter(parte -> (!parte.isEstadoParte())).count();
        mensajes.add("============== Informe de daños ============== \n");
        mensajes.add((totalPartesDamaged == 0) ? "Todos los dispositivos están funcionando" : "Total de partes dañadas -> " + String.valueOf(ironman.getPartesArmadura().stream().filter(parte -> (!parte.isEstadoParte())).count()));
        ironman.getPartesArmadura().stream().filter(parte -> (!parte.isEstadoParte())).forEach(System.out::println);
    }

    public void repararArmadura(Armadura ironman) {
        ironman.getPartesArmadura().stream().filter(parte -> (!parte.isEstadoParte())).forEach(parte -> {
            while (!parte.isEstadoParte()) {
                limpiarFifoMensajes();
                if (probabilidadDamageOrRepair(4)) {
                    parte.setEstadoParte(true);
                    mensajes.add("Parte reparada.");
                } else {
                    mensajes.add("Tony, aún estoy reparando la armadura");
                }
                escribirEnConsola(ironman, mensajes.stream().toArray(String[]::new));
            }
        });
    }

    /**
     * Función que descuenta la vida del fani bajo ataque
     *
     * @param ironman
     * @param faniHostil
     */
    public void atacarFaniHostil(Armadura ironman, Fani faniHostil) {
        if (ironman.getPartesArmadura().stream().filter(parte -> (parte.getNombreParte().toString().contains("GUANTE"))).filter(brazo -> (brazo.isEstadoParte())).count() == 2) {
            if (!isAllowedAction(ironman.getEnergia(), ironman.getPartesArmadura().get(1).getConsumoMinimo() + ironman.getPartesArmadura().get(2).getConsumoMinimo(), 1, 10)) {
                faniHostil.setEnergia(faniHostil.getEnergia() - (ironman.getPartesArmadura().get(1).getConsumoMinimo() * 2) * 10 * ((criticalHit(true)) ? 4 : 1));
            }
        } else if (ironman.getPartesArmadura().stream().filter(parte -> (parte.getNombreParte().toString().contains("GUANTE"))).filter(brazos -> (brazos.isEstadoParte())).count() == 1) {
            if (!isAllowedAction(ironman.getEnergia(), ironman.getPartesArmadura().get(1).getConsumoMinimo(), 1, 10)) {
                faniHostil.setEnergia(faniHostil.getEnergia() - (ironman.getPartesArmadura().get(1).getConsumoMinimo()) * 10 * ((criticalHit(true)) ? 4 : 1));
            }
        } else {
            System.out.println("No puedo atacar, necesito reparar la armadura");
            repararArmadura(ironman);
        }
    }

    /**
     * Si recibe true entonces decide si IronMan ataca con critical Hit Si
     * recibe false entonces decide si el Fani impacta con critical Hit
     *
     * @param ironManOrFani
     * @return
     */
    private boolean criticalHit(boolean ironManOrFani) {
        return (ironManOrFani) ? (new Random().nextInt(10) <= 6) : (new Random().nextInt(10) <= 1);
    }

    public void retiradaDeEmergencia(Armadura ironman) {
    }

    public void caminar(Armadura ironman) {
    }

    public void correr(Armadura ironman) {
    }

    public void propulsar(Armadura ironman) {
    }

    public void volar(Armadura ironman) {
    }

    public void escribirEnConsola(Armadura ironman, String... mensajes) {
        Arrays.stream(mensajes).forEach(mensaje -> System.out.println("J.A.R.V.I.S. -> " + mensaje));
        ironman.setEnergia(ironman.getEnergia() - 1);
    }

    public void hablarAJarvis(Armadura ironman, String... mensajes) {
        Arrays.stream(mensajes).forEach(mensale -> System.out.println("Tony -> " + mensajes));
        ironman.setEnergia(ironman.getEnergia() - 2);
    }

    public boolean probabilidadDamageOrRepair(int probabilidad) {
        return (new Random().nextInt(10) <= probabilidad);
    }

    public void rondaAtaquesFanis(List<Fani> listaDeFanis) {

    }

    /**
     * Retorna false si la energía es insuficiente para realizar alguna acción
     * como caminar, volar, propulsar o atacar. Retorna true si la energía es
     * suficiente para realizar la acción.
     *
     * @param energiaReactor
     * @param consumoMinimo
     * @param intensidad
     * @param tiempo
     * @return
     */
    private boolean isAllowedAction(float energiaReactor, float consumoMinimo, int intensidad, int tiempo) {
        if ((energiaReactor - (consumoMinimo * tiempo * intensidad)) < (Integer.MAX_VALUE * 0.2)) {
            limpiarFifoMensajes();
            mensajes.add("Ten cuidado estamos por debajo del 20% de energía, estamos muy débiles. Sugiero alejarse para recargar energía.");
        }
        return ((energiaReactor - (consumoMinimo * tiempo * intensidad)) <= 0);
    }

    /**
     * IF true then IRON MAN attacks first. ELSE enemy Attack First 60 %
     * probabilidad de ganar el turno de ataque para ironman.
     *
     * @return
     */
    public boolean randomTurnoAtaque() {
        return (new Random().nextInt(11) <= 6);
    }

    private void dinamicaBatalla(Jarvis jarvis) {

        int modoDeAtaque = 0;

        do {
            System.out.println("""
                               Hola, Tony. Decide por favor el modo de ataque.
                               0. Automático. (Me encargaré de la estrategia durante la ronda de batalla.)
                               1. Manual. (Deberás decidir qué hacer, atacar, huir o no hacer nada.)
                               
                               Tony. Recuerda que en esta batalla es ellos o nosotros.
                               """);
            modoDeAtaque = INPUT.nextInt();
            switch (modoDeAtaque) {
                case 0 -> {
                    System.out.println("Ejecutando modo de ataque automático.");
                    jarvis.getListaFanis().forEach(fani -> atacarFaniHostil(jarvis.getArmadura(), fani));
                    System.out.println("**************************");
                    jarvis.getListaFanis().forEach(System.out::println);
                    fs.retirarFanisEliminados(jarvis.getListaFanis());
                    System.out.println("**************************");
                    jarvis.getListaFanis().forEach(System.out::println);
                    System.out.println("**************************");
                    if(jarvis.getListaFanis().isEmpty()){
                        System.out.println("TODOS LOS FANIS ELIMINADOS");
                    }
                }
                case 1 -> {

                }
                default ->
                    System.out.println("Opción no reconocida");
            }
        } while (jarvis.getArmadura().getEnergia() >= 0 && !jarvis.getListaFanis().isEmpty());
    }

    private void limpiarFifoMensajes() {
        mensajes.clear();
    }

    public void iniciarJarvis() {

        Jarvis jarvis = crearJarvis();
        limpiarFifoMensajes();

        mensajes.add("Hola, Tony");
        mensajes.add("Detecto un total de " + jarvis.getListaFanis().size() + " F.A.N.I. Voy a ejecutar el radar para determinar cuántos de ellos son hostiles.");

        operarRadar(jarvis.getListaFanis());

        mensajes.add("Hay un total de " + jarvis.getListaFanis().size() + " F.A.N.I. hostiles");
        mensajes.add((jarvis.getListaFanis().size() >= 10) ? "Esta es la cantidad máxima de F.A.N.I hostiles que podemos atacar: "
                + jarvis.getListaFanis().size() : "Vamos a luchar contra: " + jarvis.getListaFanis().size());
        mensajes.add("Esta es la información de cada uno de ellos :" + informacionFaniHostiles((jarvis.getListaFanis().size() >= 10) ? jarvis.getListaFanis().subList(0, 10) : jarvis.getListaFanis()));
        escribirEnConsola(jarvis.getArmadura(), mensajes.stream().toArray(String[]::new));
        monitorearArmadura(jarvis.getArmadura());
        informeReactor(jarvis.getArmadura());

        dinamicaBatalla(jarvis);
    }
}
