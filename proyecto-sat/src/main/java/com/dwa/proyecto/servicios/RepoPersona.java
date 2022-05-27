package com.dwa.proyecto.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.proyecto.modelo.Persona;

public interface RepoPersona  extends CrudRepository<Persona, Integer>{
	@Query(value= "SELECT * FROM persona WHERE razonsocial= ?1 AND pass= ?2", nativeQuery= true)
	Persona validar(String razonsocial, String pass);
}
