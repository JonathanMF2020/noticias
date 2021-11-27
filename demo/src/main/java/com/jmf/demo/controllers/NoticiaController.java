package com.jmf.demo.controllers;

import java.util.ArrayList;

import com.jmf.demo.models.Noticia;
import com.jmf.demo.services.NoticiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    NoticiaService  noticiaService;

    @GetMapping()
    public ArrayList<Noticia> obtenerUsuarios(){
        return noticiaService.obtenerUsuarios();
    }

    @PostMapping()
    public Noticia guardarNoticia(@RequestBody Noticia Noticia){
        return noticiaService.guardarNoticia(Noticia);
    }
}
