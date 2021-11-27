package com.jmf.demo.controllers;

import java.util.ArrayList;

import com.jmf.demo.models.Personal;
import com.jmf.demo.services.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping()
    public ArrayList<Personal> obtenerUsuarios(){
        return personalService.obtenerUsuarios();
    }

    @PostMapping()
    public Personal guardarPersonal(@RequestBody Personal personal){
        return personalService.guardarPersonal(personal);
    }
}
