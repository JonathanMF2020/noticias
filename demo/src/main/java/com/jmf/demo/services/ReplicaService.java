package com.jmf.demo.services;


import com.jmf.demo.models.Replica;
import com.jmf.demo.repositories.ReplicaWRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplicaService {
    @Autowired
    ReplicaWRepository replicaRepository;

    public Replica guardarReplica(Replica replica){
        return replicaRepository.save(replica);
    }
}
