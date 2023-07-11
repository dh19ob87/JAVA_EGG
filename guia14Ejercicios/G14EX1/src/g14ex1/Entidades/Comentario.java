/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g14ex1.Entidades;

/**
 *
 * @author diego
 */
public class Comentario {
    
    private Integer idComentario;
    private Integer idCasa;
    private String comentario;

    public Comentario() {
    }

    public Comentario(Integer idComentario, Integer idCasa, String comentario) {
        this.idComentario = idComentario;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comentario{");
        sb.append("idComentario=").append(idComentario);
        sb.append(", idCasa=").append(idCasa);
        sb.append(", comentario=").append(comentario);
        sb.append('}');
        return sb.toString();
    }
}
