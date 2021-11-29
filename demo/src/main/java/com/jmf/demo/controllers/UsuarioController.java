package com.jmf.demo.controllers;

import java.util.ArrayList;

import com.jmf.demo.models.Usuario;
import com.jmf.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    
    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario Usuario){
        return usuarioService.guardarUsuario(Usuario);
    }
}
