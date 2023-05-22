/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra3.Entidad;

import guia10extra3.Enumerables.MarcasAutos;
import guia10extra3.Enumerables.Colores;
import guia10extra3.Enumerables.TipoVehiculo;
import java.util.Objects;
import java.time.Year;

/**
 *
 * @author diego
 */
public class Vehiculo {
    private MarcasAutos marca;
    private Year modelo;
    private long numeroDeMotor;
    private String chasis;
    private Colores color;
    private TipoVehiculo tipoAuto;
    private Persona propietario;
    
    public Vehiculo (){}

    public Vehiculo(MarcasAutos marca, Year modelo, long numeroDeMotor, String chasis, Colores color, TipoVehiculo tipoAuto, Persona propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipoAuto = tipoAuto;
        this.propietario = propietario;
    }

    public MarcasAutos getMarca() {
        return marca;
    }

    public void setMarca(MarcasAutos marca) {
        this.marca = marca;
    }

    public Year getModelo() {
        return modelo;
    }

    public void setModelo(Year modelo) {
        this.modelo = modelo;
    }

    public long getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(long numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public TipoVehiculo getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(TipoVehiculo tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.marca);
        hash = 89 * hash + Objects.hashCode(this.modelo);
        hash = 89 * hash + (int) (this.numeroDeMotor ^ (this.numeroDeMotor >>> 32));
        hash = 89 * hash + Objects.hashCode(this.chasis);
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + Objects.hashCode(this.tipoAuto);
        hash = 89 * hash + Objects.hashCode(this.propietario);
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.numeroDeMotor != other.numeroDeMotor) {
            return false;
        }
        if (!Objects.equals(this.chasis, other.chasis)) {
            return false;
        }
        if (this.marca != other.marca) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.tipoAuto != other.tipoAuto) {
            return false;
        }
        return Objects.equals(this.propietario, other.propietario);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", numeroDeMotor=" + numeroDeMotor + ", chasis=" + chasis + ", color=" + color + ", tipoAuto=" + tipoAuto + ", propietario=" + propietario + '}';
    }
}
