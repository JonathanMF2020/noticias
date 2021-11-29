package com.jmf.demo.repositories;

import com.jmf.demo.models.Replica;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplicaWRepository extends CrudRepository<Replica,Long> {

    
}

