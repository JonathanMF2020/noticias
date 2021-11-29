package com.jmf.demo.repositories;

import com.jmf.demo.models.Comentario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario,Long> {

    
}
