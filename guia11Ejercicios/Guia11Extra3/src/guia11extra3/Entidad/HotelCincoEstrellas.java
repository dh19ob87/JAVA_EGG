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
public class HotelCincoEstrellas extends HotelCuatroEstrellas {

    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimusinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimusinas, Character categoriaGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, Gerente manager) {
        super(categoriaGimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, manager);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimusinas = cantidadLimusinas;
    }

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(Integer cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cantidadSalonesConferencia);
        hash = 97 * hash + Objects.hashCode(this.cantidadSuites);
        hash = 97 * hash + Objects.hashCode(this.cantidadLimusinas);
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
        final HotelCincoEstrellas other = (HotelCincoEstrellas) obj;
        if (!Objects.equals(this.cantidadSalonesConferencia, other.cantidadSalonesConferencia)) {
            return false;
        }
        if (!Objects.equals(this.cantidadSuites, other.cantidadSuites)) {
            return false;
        }
        return Objects.equals(this.cantidadLimusinas, other.cantidadLimusinas);
    }

    @Override
    public String toString() {
        return "HotelCincoEstrellas{" + "cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimusinas=" + cantidadLimusinas + '}' + super.toString();
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        precioHabitaciones += (15 * cantidadLimusinas);
    }
}
