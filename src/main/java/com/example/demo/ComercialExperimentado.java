package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//esta es la anotacion
@Component("ComercialExperimentado")
//la anotacion tambien puede estar sin nombre y para hablarle se debe de llamar el nombre de la clase
//pero con la primera letra en minuscula
//@Component
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "esto es un informe generado por el comercial ";
		return nuevoInforme.getInformeFinanciero();
	}
	//esto es de @autowired
	//para el autowired se debe de 
	//1 crear clase + interfaz a inyectar (dependencia)
	//2 Crear constructor para inyeccion en clase que lo solicite
	//3 configurar la dependencia con @Autowired
	
	
	//en el constructor no es necesario usar el autowired pero se recomienda por si se llama mas veces
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	
	//tambien puede aplicarse desde la instancia, esto se llama Reflexion
	@Autowired
	private CreacionInformeFinanciero nuevoInforme;
		
	//autowired con un setter
	
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

}
