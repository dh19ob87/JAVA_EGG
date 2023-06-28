/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

import java.util.List;

/**
 *
 * @author diego
 */
public class Jarvis {
    private Armadura armadura;
    private List <Fani> listaFanis;

    public Jarvis() {
    }

    public Jarvis(Armadura armadura, List<Fani> listaFanis) {
        this.armadura = armadura;
        this.listaFanis = listaFanis;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public List<Fani> getListaFanis() {
        return listaFanis;
    }

    public void setListaFanis(List<Fani> listaFanis) {
        this.listaFanis = listaFanis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jarvis{");
        sb.append("armadura=").append(armadura);
        sb.append(", listaFanis=").append(listaFanis);
        sb.append('}');
        return sb.toString();
    }
}
