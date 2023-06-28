/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

/**
 *
 * @author diego
 */
public abstract class Objeto extends Posicion {

    protected float energia;
    protected int dureza;
    protected int distanciaAtaque;
    protected int potenciaDeAtaque;

    public Objeto() {
    }
    
    public Objeto(float energia, int dureza, int distanciaAtaque, int potenciaDeAtaque, int x, int y, int z) {
        super(x, y, z);
        this.energia = energia;
        this.dureza = dureza;
        this.distanciaAtaque = distanciaAtaque;
        this.potenciaDeAtaque = potenciaDeAtaque;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getDistanciaAtaque() {
        return distanciaAtaque;
    }

    public void setDistanciaAtaque(int distanciaAtaque) {
        this.distanciaAtaque = distanciaAtaque;
    }

    public int getPotenciaDeAtaque() {
        return potenciaDeAtaque;
    }

    public void setPotenciaDeAtaque(int potenciaDeAtaque) {
        this.potenciaDeAtaque = potenciaDeAtaque;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Objeto{");
        sb.append("energia=").append(energia);
        sb.append(", dureza=").append(dureza);
        sb.append(", distanciaAtaque=").append(distanciaAtaque);
        sb.append(", potenciaDeAtaque=").append(potenciaDeAtaque);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
