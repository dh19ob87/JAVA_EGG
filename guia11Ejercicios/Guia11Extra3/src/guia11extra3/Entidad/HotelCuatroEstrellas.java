/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class HotelCuatroEstrellas extends Hotel {

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
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.categoriaGimnasio);
        hash = 29 * hash + Objects.hashCode(this.nombreRestaurante);
        hash = 29 * hash + Objects.hashCode(this.capacidadRestaurante);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HotelCuatroEstrellas other = (HotelCuatroEstrellas) obj;
        if (!Objects.equals(this.nombreRestaurante, other.nombreRestaurante)) {
            return false;
        }
        if (!Objects.equals(this.categoriaGimnasio, other.categoriaGimnasio)) {
            return false;
        }
        return Objects.equals(this.capacidadRestaurante, other.capacidadRestaurante);
    }
    
    @Override
    public String toString() {
        return "HotelCuatroEstrellas{" + "categoriaGimnasio=" + categoriaGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}' + super.toString();
    }

    @Override
    public void precioHabitacion() {
        precioHabitaciones = 50 + (cantidadCamas) + ((capacidadRestaurante < 30) ? 10d : (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) ? 30d : 50d)
                + ((categoriaGimnasio.toString().equalsIgnoreCase("a")) ? 50d : 30d);
    }
}
