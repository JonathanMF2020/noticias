package com.jmf.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "replica")
public class Replica {
    @Id
    @GeneratedValue
    int idnoticia;
    @ManyToOne
    @JoinColumn(name="idcomentario")
    Comentario comentario;
    @ManyToOne
    @JoinColumn(name="idpersona")
    Persona persona;
    @Column(nullable=false)
    String replica;
    @Column(nullable=false)
    Date fechahora;

    
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }


    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public int getIdnoticia() {
        return idnoticia;
    }

    public void setIdnoticia(int idnoticia) {
        this.idnoticia = idnoticia;
    }

    public Persona getPersona() {
        return persona;
    }

}
