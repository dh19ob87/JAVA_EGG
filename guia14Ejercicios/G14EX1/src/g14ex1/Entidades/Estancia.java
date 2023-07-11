/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Entidades;

import java.time.LocalDate;

/**
 *
 * @author diego
 */
public class Estancia {
    
    private Integer idEstancia;
    private Integer idCliente;
    private Integer idCasa;
    private String nombreHuesped;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;

    public Estancia() {
    }

    public Estancia(Integer idEstancia, Integer idCliente, Integer idCasa, String nombreHuesped, LocalDate fechaDesde, LocalDate fechaHasta) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Integer getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(Integer idEstancia) {
        this.idEstancia = idEstancia;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estancia{");
        sb.append("idEstancia=").append(idEstancia);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", idCasa=").append(idCasa);
        sb.append(", nombreHuesped=").append(nombreHuesped);
        sb.append(", fechaDesde=").append(fechaDesde);
        sb.append(", fechaHasta=").append(fechaHasta);
        sb.append('}');
        return sb.toString();
    }
}
