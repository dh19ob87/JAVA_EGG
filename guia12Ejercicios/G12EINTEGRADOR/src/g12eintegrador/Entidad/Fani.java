/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

import g12eintegrador.Enumerables.TipoMovimiento;
import java.util.Objects;

/**
 *
 * @author diego
 */
public class Fani extends Objeto{
    
    private TipoMovimiento movimiento;
    private boolean  hostil;

    public Fani() {
    }

    public Fani(TipoMovimiento movimiento, boolean hostil, float energia, int dureza, int distanciaAtaque, int potenciaDeAtaque, int x, int y, int z) {
        super(energia, dureza, distanciaAtaque, potenciaDeAtaque, x, y, z);
        this.movimiento = movimiento;
        this.hostil = hostil;
    }

    public TipoMovimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(TipoMovimiento movimiento) {
        this.movimiento = movimiento;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.movimiento);
        hash = 37 * hash + (this.hostil ? 1 : 0);
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
        final Fani other = (Fani) obj;
        if (this.hostil != other.hostil) {
            return false;
        }
        return this.movimiento == other.movimiento;
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FANI{");
        sb.append("movimiento=").append(movimiento);
        sb.append(", hostil=").append(hostil);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
