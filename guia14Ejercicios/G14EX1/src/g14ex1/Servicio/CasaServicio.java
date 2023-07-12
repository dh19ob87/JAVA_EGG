/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Servicio;

import g14ex1.Entidades.Casa;
import g14ex1.Entidades.Comentario;
import g14ex1.Persistencia.CasaDAO;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CasaServicio {
    
    private CasaDAO daoCasa;
    private static final Scanner INPUT = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public CasaServicio(){
        this.daoCasa = new CasaDAO();
    }
    
    public Boolean existeLaCasa (int idCasa) throws Exception{
        try {
            return daoCasa.consultarCasa(idCasa) == null;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarCasasLimpias() throws Exception{
        try {
            daoCasa.consultarCasasLimpias().forEach(objeto -> {
                if(objeto instanceof Casa house){
                    System.out.println(house.toString());
                }else if(objeto instanceof Comentario comment){
                    System.out.println(comment.toString());
                }
            });
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarCantidadDeCasasPorPais() throws Exception{
        try {
            daoCasa.consultarCantidadDeCasasPorPais().forEach((key, value) -> {
                System.out.println("País -> " + key + " | Cantidad De Casas -> " + value);
            });
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarPreciosActualizados() throws Exception{
        try {
            System.out.println("Por favor ingrese el incremento entre 1% y 100%");
            daoCasa.aumentarPrecioHabitacion(INPUT.nextInt()).forEach((key, value) -> System.out.println("casa -> " + key + " | precio -> " + value));
        } catch (Exception e) {
            throw e;
        }
    }
}
