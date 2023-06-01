package br.ufrn.imd.modelo;

import java.util.Locale;

public class Mulher extends Pessoa{
	
	public String calculaIMC() {
		double imc = 0;
		String resultado = "";
		String retorno = "";
		
		imc = this.peso / (this.altura*this.altura);
		
		if(imc<19) {
			resultado = "Abaixo do peso ideal";
		}
		if(imc>= 19 && imc<=25.8) {
			resultado = "Peso ideal";
		}
		if(imc>25.8) {
			resultado = "Acima do peso ideal";
		}
		
		retorno = "IMC = " + String.format(Locale.US, "%.2f", imc) + " - " + resultado;
		return retorno;
	}

}
