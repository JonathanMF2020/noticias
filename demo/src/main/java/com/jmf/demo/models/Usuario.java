/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmf.demo.models;

import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private int idusuario;
    @Column(nullable=false)
    private Date fechaingreso;
    @Column(nullable=false)
    private String correo;
    @Column(nullable=false)
    private String pasword;
    @OneToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    
}
