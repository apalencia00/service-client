package com.toysblizz.onboarding.serviceclient.application.web;


import com.library.mytoysblizz.application.persistence.persona.PersonaMapper;
import com.library.mytoysblizz.domain.dto.Persona;
import com.library.mytoysblizz.ports.out.persona.AddPersona;
import com.toysblizz.onboarding.serviceclient.application.ports.in.LoadOrCreatePersona;
import com.toysblizz.onboarding.serviceclient.application.services.PersonaServicesCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/persona")
@RequiredArgsConstructor
public class PostCreateClient {

    private final LoadOrCreatePersona loadOrCreatePersona;

    @PostMapping(value = "/crear")
    public ResponseEntity crearPersona(@RequestBody Persona person){
        loadOrCreatePersona.create(person);
        return ResponseEntity.ok(200);
    }

}
