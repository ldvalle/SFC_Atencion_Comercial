package com.edesur;

import servicios.procCalcomesSRV;

public class Calcom {

	public static void main(String[] args) {
		String sArea="SIC0";
		String sValorLeido ="SIC000018979";
		String sAux = sValorLeido.substring(sArea.length()+1, sValorLeido.length());
		System.out.println("Valor extraido [" + sAux + "]");
		long lValor = Long.parseLong(sAux)+1;
		String sValorFinal = sArea + String.format("%08d", lValor);
		System.out.println("valor final [" + sValorFinal + "] ");
		System.exit(1);
		
		
		procCalcomesSRV miCalcom = new procCalcomesSRV();
		
		miCalcom.CalComes();

	}

}
