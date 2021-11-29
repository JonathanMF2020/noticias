package com.jmf.demo.controllers;

import com.jmf.demo.models.Replica;
import com.jmf.demo.services.ReplicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/replica")
public class ReplicaController {
    @Autowired
    ReplicaService  replicaService;
    
    
    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping()
    public Replica guardarReplica(@RequestBody Replica replica){
        return replicaService.guardarReplica(replica);
    }
}
