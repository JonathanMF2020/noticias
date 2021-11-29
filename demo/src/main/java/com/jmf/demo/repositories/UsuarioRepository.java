package com.jmf.demo.repositories;

import com.jmf.demo.models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    Usuario findUsuarioByCorreoAndPasword(@Param("correo") String correo, @Param("password") String password);
    
}
