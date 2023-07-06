/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.Entidades;

/**
 *
 * @author diego
 */
public class Fabricante {
    private Integer codigo;
    private String nombre;
    
    public Fabricante(){}
    
    public Fabricante (Integer codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setCodigo (Integer codigo){
        this.codigo = codigo;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public Integer getCodigo (){
        return codigo;
    }
    
    public String getNombre (){
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}
