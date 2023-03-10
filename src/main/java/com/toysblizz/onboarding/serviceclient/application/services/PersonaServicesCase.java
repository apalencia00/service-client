package com.toysblizz.onboarding.serviceclient.application.services;


import com.library.mytoysblizz.application.persistence.persona.PersonaEntity;
import com.library.mytoysblizz.domain.dto.Persona;
import com.library.mytoysblizz.ports.out.persona.AddPersona;
import com.toysblizz.onboarding.serviceclient.application.ports.in.LoadOrCreatePersona;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonaServicesCase implements LoadOrCreatePersona {

    private final AddPersona addPersona;
    @Override
    public PersonaEntity create(Persona personaDto) {
        PersonaEntity per = addPersona.create(personaDto);
        return per;
    }
}
