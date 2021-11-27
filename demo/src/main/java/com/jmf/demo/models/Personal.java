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
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue
    private int idpersonal;
    @Column(nullable=false)
    private Date fechaingreso;
    @Column(nullable=false)
    private String matricula;
    @Column(nullable=false)
    private String password;
    @OneToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;


    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    
}
