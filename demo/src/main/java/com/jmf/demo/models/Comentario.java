package com.jmf.demo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue
    int idcomentario;
    @ManyToOne
    @JoinColumn(name="idpersona")
    Persona persona;
    @ManyToOne
    @JoinColumn(name="idnoticia")
    Noticia noticia;
    @Column(nullable=false)
    String comentario;
    @Column(nullable=false)
    Date fechahora;
    @OneToMany(mappedBy = "comentario")
    List<Replica> replicas;


    public String getComentario() {
        return comentario;
    }

    public Persona getPersona() {
        return persona;
    }
    

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public List<Replica> getReplicas() {
        return replicas;
    }

    public void setReplicas(List<Replica> replica) {
        this.replicas = replica;
    }
}

