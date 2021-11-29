package com.jmf.demo.controllers;

import java.util.ArrayList;
import java.util.Map;

import com.jmf.demo.models.Personal;
import com.jmf.demo.services.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    PersonalService  personalService;

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping()
    public ArrayList<Personal> obtenerUsuarios(){
        return personalService.obtenerUsuarios();
    }
    
    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping()
    public Personal guardarPersonal(@RequestBody Personal personal){
        return personalService.guardarPersonal(personal);
    }
    
    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseEntity<?> login(@RequestBody(required = false) Map<String, String> json){
        return personalService.login(json.get("matricula"), json.get("password"));
    }
    
}
