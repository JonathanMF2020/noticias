package com.jmf.demo.services;

import java.util.ArrayList;

import com.jmf.demo.models.Noticia;
import com.jmf.demo.repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService {
    @Autowired
    NoticiaRepository noticiaRepository;

    public ArrayList<Noticia>  obtenerUsuarios(){
        return (ArrayList<Noticia>) noticiaRepository.findAll();
    }

    public Noticia guardarNoticia(Noticia Noticia){
        
        return noticiaRepository.save(Noticia);
    }
}