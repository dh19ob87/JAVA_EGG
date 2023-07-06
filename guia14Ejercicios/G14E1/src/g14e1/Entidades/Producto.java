/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14e1.Entidades;

/**
 *
 * @author diego
 */
public class Producto {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigoFabricante;
    
    public Producto (){}
    
    public Producto (Integer codigo, String nombre, Double precio, Integer codigoFabricante){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
    
    public void setCodigo (Integer codigo){
        this.codigo = codigo;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio (Double precio){
        this.precio = precio;
    }
    
    public void setCodigoFabricante (Integer codigoFabricante){
        this.codigoFabricante = codigoFabricante;
    }
    
    public Integer getCodigo (){
        return codigo;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public Double getPrecio (){
        return precio;
    }
    
    public Integer getCodigoFabricante (){
        return codigoFabricante;
    }
    
    @Override
    
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Fabricante{");
        str.append("codigo=").append(codigo);
        str.append(", nombre=").append(nombre);
        str.append(", precio=").append(precio);
        str.append(", codigoFabricante =").append(codigoFabricante);
        str.append("}");
        return str.toString();
    }
}
