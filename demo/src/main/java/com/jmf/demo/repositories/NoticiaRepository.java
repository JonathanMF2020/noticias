package com.jmf.demo.repositories;

import com.jmf.demo.models.Noticia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia,Long> {

    
}
