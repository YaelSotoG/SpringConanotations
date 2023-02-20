package com.example.demo;

import org.springframework.stereotype.Component;
//esta es la anotacion
@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "esto es un informe generado por el comercial ";
	}

}
