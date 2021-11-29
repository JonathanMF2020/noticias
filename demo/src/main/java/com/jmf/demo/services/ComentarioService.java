package com.jmf.demo.services;

import java.util.ArrayList;

import com.jmf.demo.models.Comentario;
import com.jmf.demo.repositories.ComentarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {
    @Autowired
    ComentarioRepository comentarioRepository;

    public ArrayList<Comentario>  obtenerUsuarios(){
        return (ArrayList<Comentario>) comentarioRepository.findAll();
    }

    public Comentario guardarComentario(Comentario Comentario){
        
        return comentarioRepository.save(Comentario);
    }


}
