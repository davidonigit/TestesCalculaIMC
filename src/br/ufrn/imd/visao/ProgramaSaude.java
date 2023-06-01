package br.ufrn.imd.visao;

import java.text.ParseException;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.modelo.Homem;
import br.ufrn.imd.modelo.Mulher;
import br.ufrn.imd.modelo.Pessoa;

public class ProgramaSaude {
	public static void main(String[] args) throws ParseException{
		
		Repositorio pacientes = new Repositorio();
		
		Pessoa mulher1 = new Mulher();
		mulher1.setNome("Frida Kahlo");
		mulher1.setDataNascimento("06/07/1907");
		mulher1.setPeso(48.38);
		mulher1.setAltura(1.60);
		System.out.println(mulher1.toString());
		System.out.println(mulher1.calculaIMC());
		
		Pessoa homem1 = new Homem();
		homem1.setNome("Zé Lezin");
		homem1.setDataNascimento("20/01/1945");
		homem1.setPeso(74.8);
		homem1.setAltura(1.75);
		System.out.println(homem1.toString());
		System.out.println(homem1.calculaIMC());
		
		pacientes.addPessoa(mulher1);
		pacientes.addPessoa(homem1);
		
		
	}
}
