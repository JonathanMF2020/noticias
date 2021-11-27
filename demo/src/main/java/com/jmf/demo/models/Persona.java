/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmf.demo.models;


import javax.persistence.*;
/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue
    private int idpersona;
    @Column(nullable=false)
    private String apepaterno;
    @Column(nullable=false)
    private String apematerno;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String direccion;
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;
    @OneToOne(mappedBy = "persona")
    private Personal personal;


    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    
}
