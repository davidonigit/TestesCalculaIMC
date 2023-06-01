package br.ufrn.imd.modelo;

import java.util.Locale;

public class Homem extends Pessoa{

	public String calculaIMC() {
		double imc = 0;
		String resultado = "";
		String retorno = "";
		
		imc = this.peso / (this.altura*this.altura);
		
		if(imc<20.7) {
			resultado = "Abaixo do peso ideal";
		}
		if(imc>= 20.7 && imc<=26.4) {
			resultado = "Peso ideal";
		}
		if(imc>26.4) {
			resultado = "Acima do peso ideal";
		}
		
		retorno = "IMC = " + String.format(Locale.US, "%.2f", imc) + " - " + resultado;
		return retorno;
	}
	

}
