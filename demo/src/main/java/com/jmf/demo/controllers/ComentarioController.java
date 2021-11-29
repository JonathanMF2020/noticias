package com.jmf.demo.controllers;

import java.util.ArrayList;

import com.jmf.demo.models.Comentario;
import com.jmf.demo.services.ComentarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    @Autowired
    ComentarioService  comentarioService;
    
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping()
    public ArrayList<Comentario> obtenerUsuarios(){
        return comentarioService.obtenerUsuarios();
    }

    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping()
    public Comentario guardarComentario(@RequestBody Comentario Comentario){
        return comentarioService.guardarComentario(Comentario);
    }
}
