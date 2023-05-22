/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Entidad;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Objects;
import guia10extra3.Enumerables.FormasDePago;
import guia10extra3.Enumerables.TiposDeCobertura;
/**
 *
 * @author diego
 * @param <T> Enumerable Forma De Pago
 * @param <G> Enumerable tipo de cobertura
 */
public class Poliza <T,G> {
    private Persona acreedor;
    private Vehiculo auto;
    private long numeroDePoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int cantidadDeCuotas;
    private FormasDePago formaDePago;
    private double montoTotalAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private TiposDeCobertura tipoDeCobertura;
    private LinkedList <Cuotas> cuotas;
    
    public Poliza (){}

    public Poliza(Persona acreedor, Vehiculo auto, long numeroDePoliza, LocalDate fechaInicio, LocalDate fechaFinal, int cantidadDeCuotas, FormasDePago formaDePago, double montoTotalAsegurado, boolean granizo, double montoMaximoGranizo, TiposDeCobertura tipoDeCobertura, LinkedList<Cuotas> cuotas) {
        this.acreedor = acreedor;
        this.auto = auto;
        this.numeroDePoliza = numeroDePoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
        this.cuotas = cuotas;
    }

    public Persona getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(Persona acreedor) {
        this.acreedor = acreedor;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public long getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(long numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public FormasDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormasDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public TiposDeCobertura getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(TiposDeCobertura tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public LinkedList<Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(LinkedList<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.acreedor);
        hash = 79 * hash + Objects.hashCode(this.auto);
        hash = 79 * hash + (int) (this.numeroDePoliza ^ (this.numeroDePoliza >>> 32));
        hash = 79 * hash + Objects.hashCode(this.fechaInicio);
        hash = 79 * hash + Objects.hashCode(this.fechaFinal);
        hash = 79 * hash + this.cantidadDeCuotas;
        hash = 79 * hash + Objects.hashCode(this.formaDePago);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.montoTotalAsegurado) ^ (Double.doubleToLongBits(this.montoTotalAsegurado) >>> 32));
        hash = 79 * hash + (this.granizo ? 1 : 0);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.montoMaximoGranizo) ^ (Double.doubleToLongBits(this.montoMaximoGranizo) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.tipoDeCobertura);
        hash = 79 * hash + Objects.hashCode(this.cuotas);
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
        final Poliza<?, ?> other = (Poliza<?, ?>) obj;
        if (this.numeroDePoliza != other.numeroDePoliza) {
            return false;
        }
        if (this.cantidadDeCuotas != other.cantidadDeCuotas) {
            return false;
        }
        if (Double.doubleToLongBits(this.montoTotalAsegurado) != Double.doubleToLongBits(other.montoTotalAsegurado)) {
            return false;
        }
        if (this.granizo != other.granizo) {
            return false;
        }
        if (Double.doubleToLongBits(this.montoMaximoGranizo) != Double.doubleToLongBits(other.montoMaximoGranizo)) {
            return false;
        }
        if (!Objects.equals(this.acreedor, other.acreedor)) {
            return false;
        }
        if (!Objects.equals(this.auto, other.auto)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFinal, other.fechaFinal)) {
            return false;
        }
        if (this.formaDePago != other.formaDePago) {
            return false;
        }
        if (this.tipoDeCobertura != other.tipoDeCobertura) {
            return false;
        }
        return Objects.equals(this.cuotas, other.cuotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poliza{");
        sb.append("acreedor=").append(acreedor);
        sb.append(", auto=").append(auto);
        sb.append(", numeroDePoliza=").append(numeroDePoliza);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFinal=").append(fechaFinal);
        sb.append(", cantidadDeCuotas=").append(cantidadDeCuotas);
        sb.append(", formaDePago=").append(formaDePago);
        sb.append(", montoTotalAsegurado=").append(montoTotalAsegurado);
        sb.append(", granizo=").append(granizo);
        sb.append(", montoMaximoGranizo=").append(montoMaximoGranizo);
        sb.append(", tipoDeCobertura=").append(tipoDeCobertura);
        sb.append(", cuotas=").append(cuotas);
        sb.append('}');
        return sb.toString();
    }

    
}
