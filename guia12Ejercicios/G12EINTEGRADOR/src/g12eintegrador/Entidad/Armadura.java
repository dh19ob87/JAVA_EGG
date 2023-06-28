/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

import g12eintegrador.Enumerables.Color;
import java.util.List;

/**
 *
 * @author diego
 */
public class Armadura extends Objeto{
    
    private Color colorPrimario;
    private Color colorSecundario;
    private List <Parte> partesArmadura;

    public Armadura(Color colorPrimario, Color colorSecundario, List<Parte> partesArmadura, float energia, int dureza, int distanciaAtaque, int potenciaDeAtaque, int x, int y, int z) {
        super(energia, dureza, distanciaAtaque, potenciaDeAtaque, x, y, z);
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.partesArmadura = partesArmadura;
    }

    public Armadura() {
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public List<Parte> getPartesArmadura() {
        return partesArmadura;
    }

    public void setPartesArmadura(List<Parte> partesArmadura) {
        this.partesArmadura = partesArmadura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Armadura{");
        sb.append("colorPrimario=").append(colorPrimario);
        sb.append(", colorSecundario=").append(colorSecundario);
        sb.append(", partesArmadura=").append(partesArmadura);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
