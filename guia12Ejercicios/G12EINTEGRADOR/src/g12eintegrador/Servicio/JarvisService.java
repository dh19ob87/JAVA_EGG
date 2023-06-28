/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Servicio;

import g12eintegrador.Entidad.Armadura;
import g12eintegrador.Entidad.Fani;
import g12eintegrador.Entidad.Jarvis;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import g12eintegrador.Comparadores.Comparador;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class JarvisService {

    public Jarvis crearJarvis() {

        ArmaduraServicio as = new ArmaduraServicio();
        FaniServicio fs = new FaniServicio();

        return new Jarvis(as.crearArmadura(), fs.crearListaDeFanis());
    }

    public void monitorearArmadura(Armadura ironman) {
        System.out.println("""
                           Iniciando monitoreo de la armadura.
                           """);
    }

    public void informeDataReactor(Armadura ironman) {
        System.out.println(ironman.getPartesArmadura().stream().filter(parte -> parte.getNombreParte().toString().equalsIgnoreCase("reactor")).findFirst().get().isEstadoParte());
    }

    public void informeDamage(Armadura ironman) {
    }

    public void repararArmadura(Armadura ironman) {
    }

    /**
     * Retorna los 10 primeros fanis dentro del rango de ataque de iron man
     *
     * @param listaDeFanis
     * @return
     */
    public List<Fani> operarRadar(List<Fani> listaDeFanis) {
        listaDeFanis.sort(Comparador.ordenarFanisPorDistanciaAsc);
        List<Fani> fanisHostiles = listaDeFanis.stream().filter(fani -> fani.isHostil()).collect(Collectors.toList());
        return (fanisHostiles.size() < 10) ? fanisHostiles : listaDeFanis.stream().filter(fani -> fani.isHostil()).collect(Collectors.toList()).subList(0, 10);
    }
    
    public String informacionFaniHostiles(List<Fani> listaFaniHostiles){
        StringBuilder mensaje = new StringBuilder();
        
        listaFaniHostiles.forEach(fani ->{
            mensaje.append("\n======================\n");
            mensaje.append("Tipo de F.A.N.I. -> ").append(fani.getMovimiento()).append("\n");
            mensaje.append("Energía -> ").append(fani.getEnergia()).append("\n");
            mensaje.append("Dureza -> ").append(fani.getDureza()).append("\n");
            mensaje.append("Distancia de ataque -> ").append(fani.getDistanciaAtaque()).append("\n");
            mensaje.append("Potencia de ataque -> ").append(fani.getPotenciaDeAtaque()).append("\n");
            mensaje.append("Coordenadas cartesianas -> x: ").append(fani.getX()).append(" km | y: ").append(fani.getY()).append(" km | z: ").append(fani.getZ()).append(" km\n");
            mensaje.append("Coordenadas esféricas : ").append("rho: ").append(Math.sqrt((Math.pow(fani.getX(), 2)) + (Math.pow(fani.getY(), 2)) + (Math.pow(fani.getZ(), 2))))
                    .append("km | <- theta ->: ").append((fani.getX() == 0) ? 0 : (fani.getX() < 0 && fani.getY() > 0 || fani.getX() < 0 && fani.getY() < 0) ? (Math.atan(fani.getY() / fani.getX()) + 180) : (fani.getX() > 0 && fani.getY() < 0) ? (Math.atan(fani.getY() / fani.getX()) + 360) : (Math.atan(fani.getY() / fani.getX())))
                    .append("° | v varphi ^: ").append(Math.acos((fani.getZ() / (Math.sqrt((Math.pow(fani.getX(), 2)) + (Math.pow(fani.getY(), 2)) + (Math.pow(fani.getZ(), 2))))))).append("°\n");
            mensaje.append("======================\n");
        });
        
        return mensaje.toString();
    }

    public void atacarFaniHostil(Fani faniHostil) {
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

    public void escribirEnConsola(Armadura ironman, String ... mensajes) {
        
        Arrays.stream(mensajes).forEach(mensaje -> System.out.println("J.A.R.V.I.S. -> " + mensaje));
        ironman.setEnergia(ironman.getEnergia() - 1);
    }

    public void leerMensaje(Armadura ironman) {
    }

    public void calcularEnergia(Armadura ironman) {
    }

    public boolean probabilidadDamageOrRepair(int probabilidad) {
        return true;
    }

    public int calcularDistancia(Fani faniHostil) {
        return 0;
    }

    public void iniciarJarvis() {

        ArrayList <String> mensajes = new ArrayList<>();
        Jarvis jarvis = crearJarvis();
            List<Fani> primerosDiezFanisEnElAlcance = operarRadar(jarvis.getListaFanis());
            mensajes.add("detecto un total de " + jarvis.getListaFanis().size() + " F.A.N.I.");
            mensajes.add("hay un total de " + jarvis.getListaFanis().stream().filter(fani -> fani.isHostil()).count() + " F.A.N.I. hostiles");
            mensajes.add("esta es la cantidad máxima de F.A.N.I hostiles que podemos atacar: " + primerosDiezFanisEnElAlcance.size());
            mensajes.add("esta es la información de cada uno de ellos :" + informacionFaniHostiles(primerosDiezFanisEnElAlcance));
            escribirEnConsola(jarvis.getArmadura(), mensajes.stream().toArray(String[]::new));
//        do {            
            
//        } while (!jarvis.getListaFanis().isEmpty() && jarvis.getArmadura().getEnergia() > 0);
//        
//        if(jarvis.getListaFanis().isEmpty() && jarvis.getArmadura().getEnergia() > 0){
//            escribirEnConsola(1, jarvis.getArmadura(), "¡Vencimos!");
//        }else{
//            escribirEnConsola(2, jarvis.getArmadura(), " señor Tony al final resulta que sí estoy programado para sentir. Lo lamento mucho, no lo hemos logrado. Lo extrañaré.");
//        }
    }
}
