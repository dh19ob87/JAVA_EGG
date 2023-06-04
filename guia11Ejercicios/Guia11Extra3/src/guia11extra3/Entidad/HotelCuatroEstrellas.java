/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public class HotelCuatroEstrellas extends Hotel{
    protected Character categoriaGimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(Character categoriaGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, Gerente manager) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, manager);
        this.categoriaGimnasio = categoriaGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Character getCategoriaGimnasio() {
        return categoriaGimnasio;
    }

    public void setCategoriaGimnasio(Character categoriaGimnasio) {
        this.categoriaGimnasio = categoriaGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "HotelCuatroEstrellas{" + "categoriaGimnasio=" + categoriaGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
    @Override
    protected Double precioHabitacion(){
        return 0d;
    }
}
