/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12e3.Entidad;

/**
 *
 * @author diego
 */
public class DivisionNumero {
    private Integer numerador;
    private Integer denominador;
    
    public DivisionNumero(){
    }
    
    public DivisionNumero(Integer numerador, Integer denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void setNumerador (Integer numerador){
        this.numerador = numerador;
    }
    
    public Integer getNumerador (){
        return numerador;
    }
    
    public void setDenominador (Integer denominador){
        this.denominador = denominador;
    }
    
    public Integer getDenominador (){
        return denominador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DivisionNumero{");
        sb.append("numerador=").append(numerador);
        sb.append(", denominador=").append(denominador);
        sb.append('}');
        return sb.toString();
    }
}
