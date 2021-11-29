package com.jmf.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.jmf.demo.models.Personal;
import com.jmf.demo.models.Usuario;
import com.jmf.demo.repositories.PersonalRepository;
import com.jmf.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {
    @Autowired
    PersonalRepository personalRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Personal>  obtenerUsuarios(){
        return (ArrayList<Personal>) personalRepository.findAll();
    }

    public Personal guardarPersonal(Personal personal){
        return personalRepository.save(personal);
    }

    public ResponseEntity<?> login(String matricula, String password){
        Map<String, Object> json = new HashMap<String, Object>();
        Personal personal = personalRepository.findPersonalByMatriculaAndPassword(matricula, password);
        if(personal != null){
            json.put("personal", personal);
            json.put("tipo", "personal");
            return ResponseEntity.status(200).body(json);
        }else{
            Usuario usuario = usuarioRepository.findUsuarioByCorreoAndPasword(matricula, password);
            if(usuario != null){
                json.put("usuario", usuario);
                json.put("tipo", "usuario");
                return ResponseEntity.status(200).body(json);
            }else{
                json.put("error", "No se encontro el usuario");
                return ResponseEntity.status(201).body(json);
            } 
        }
        
    }
}
