package com.toysblizz.onboarding.serviceclient.application.ports.in;

import com.library.mytoysblizz.application.persistence.persona.PersonaEntity;
import com.library.mytoysblizz.domain.dto.Persona;

public interface LoadOrCreatePersona {

    PersonaEntity create(Persona personaDto);
}
