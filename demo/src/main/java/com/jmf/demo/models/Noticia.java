package com.jmf.demo.models;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "noticia")
public class Noticia {
    @Id
    @GeneratedValue
    int idnoticia;
    @Column(nullable = false)
    String encabezado;
    @Column(nullable = false)
    String cuerpo;
    @ManyToOne
    @JoinColumn(name = "idpersonal")
    Personal personal;
    @OneToMany(mappedBy = "noticia")
    Collection<Comentario> comentarios;

    public Collection<Comentario> getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(Collection<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getIdnoticia() {
        return idnoticia;
    }

    public void setIdnoticia(int idnoticia) {
        this.idnoticia = idnoticia;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    
}
