package com.dwa.proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.proyecto.modelo.Persona;
@Service
public class PersonaServicio {
	
	@Autowired
	private RepoPersona repousu;
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje= mensaje;
	}
	
	public boolean validar(String rfc, String clave)
	{
		Persona usr= repousu.validar(rfc,clave);
		if(usr !=null)
		{
			return true;
		}
		Mensaje= "Datos de acceso incorrecto";
		return false;
	}
	
	public boolean agregar(Persona u)
	{
		try
		{
			repousu.save(u);
			this.Mensaje= "Datos de la solicitud fueron almacenados con exito";
			return true;
		}
		catch(Exception e)
		{
			this.Mensaje= "Error al registrar la solicitud";
			return false;
		}
	}
}
