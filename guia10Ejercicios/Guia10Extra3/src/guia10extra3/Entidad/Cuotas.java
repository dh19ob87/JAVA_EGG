/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Entidad;

import java.time.LocalDate;
import java.util.Objects;
import guia10extra3.Enumerables.FormasDePago;
/**
 *
 * @author diego
 */
public class Cuotas {
    private int numeroDeCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private LocalDate fechaDeVencimiento;
    private FormasDePago formaDePago;

    public Cuotas() {
    }

    public Cuotas(int numeroDeCuota, double montoTotalCuota, boolean pagada, LocalDate fechaDeVencimiento, FormasDePago formaDePago) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public FormasDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormasDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numeroDeCuota;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.montoTotalCuota) ^ (Double.doubleToLongBits(this.montoTotalCuota) >>> 32));
        hash = 41 * hash + (this.pagada ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.fechaDeVencimiento);
        hash = 41 * hash + Objects.hashCode(this.formaDePago);
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
        final Cuotas other = (Cuotas) obj;
        if (this.numeroDeCuota != other.numeroDeCuota) {
            return false;
        }
        if (Double.doubleToLongBits(this.montoTotalCuota) != Double.doubleToLongBits(other.montoTotalCuota)) {
            return false;
        }
        if (this.pagada != other.pagada) {
            return false;
        }
        if (!Objects.equals(this.fechaDeVencimiento, other.fechaDeVencimiento)) {
            return false;
        }
        return this.formaDePago == other.formaDePago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numeroDeCuota=" + numeroDeCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", fechaDeVencimiento=" + fechaDeVencimiento + ", formaDePago=" + formaDePago + '}';
    }
}
