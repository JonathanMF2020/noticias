package com.jmf.demo.services;

import java.util.ArrayList;

import com.jmf.demo.models.Usuario;
import com.jmf.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario>  obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario Usuario){
        return usuarioRepository.save(Usuario);
    }
}
