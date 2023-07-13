/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Servicio;

import g14ex1.Entidades.Familia;
import g14ex1.Persistencia.FamiliaDAO;

/**
 *
 * @author diego
 */
public class FamilisaServicio {
    
    private FamiliaDAO daoFamilia;
    
    public FamilisaServicio(){
        this.daoFamilia = new FamiliaDAO();
    }
    
    public void listarFamiliasConMenosDeTresHijosMenoresDeDiezAnios() throws Exception{
        try {
            daoFamilia.consultarFamiliasCantHijosMenosA3YEdadMenorA10().forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarFamiliasConEmailHotmail () throws Exception {
        try {
            daoFamilia.consultarEmailsHotmail().forEach(System.out::println);
        } catch (Exception e) {
            throw e;
        }
    }
}
