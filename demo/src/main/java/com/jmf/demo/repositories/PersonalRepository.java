package com.jmf.demo.repositories;

import com.jmf.demo.models.Personal;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends CrudRepository<Personal,Long> {

    
}
