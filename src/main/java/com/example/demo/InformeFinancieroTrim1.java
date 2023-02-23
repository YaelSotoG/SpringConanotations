package com.example.demo;

import org.springframework.stereotype.Component;

//esto para registrarlo en string
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre 1";
	}

}
