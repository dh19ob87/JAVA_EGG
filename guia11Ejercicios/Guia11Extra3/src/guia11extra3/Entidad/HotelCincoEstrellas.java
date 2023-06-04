/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra3.Entidad;

/**
 *
 * @author diego
 */
public class HotelCincoEstrellas extends HotelCuatroEstrellas{
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
    public String toString() {
        return "HotelCincoEstrellas{" + "cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimusinas=" + cantidadLimusinas + '}';
    }
    
    @Override
    protected Double precioHabitacion(){
        return 0d;
    }
}
