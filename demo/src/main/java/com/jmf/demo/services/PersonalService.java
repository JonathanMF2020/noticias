package com.jmf.demo.services;

import java.util.ArrayList;

import com.jmf.demo.models.Personal;
import com.jmf.demo.repositories.PersonalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {
    @Autowired
    PersonalRepository personalRepository;

    public ArrayList<Personal>  obtenerUsuarios(){
        return (ArrayList<Personal>) personalRepository.findAll();
    }

    public Personal guardarPersonal(Personal personal){
        return personalRepository.save(personal);
    }
}
