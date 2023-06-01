/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Entidad;

import java.time.Year;
/**
 *
 * @author diego
 */
public class Barco {
    private Long matricula;
    private Double eslora;
    private Year anioDeFabricacion;
    
    public Barco (){}
    
    public Barco (Long matricula, Double eslora, Year anioDeFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public void setMatricula(Long matricula){
        this.matricula = matricula;
    }
    
    public Long getMatricula(){
        return matricula;
    }
    
    public void setEslora (Double eslora){
        this.eslora = eslora;
    }
    
    public Double getEslora (){
        return eslora;
    }
    
    public void setAnioDeFabricacion (Year anioDeFabricacion){
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public Year getAnioDeFabricacion(){
        return anioDeFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + '}';
    }
}
