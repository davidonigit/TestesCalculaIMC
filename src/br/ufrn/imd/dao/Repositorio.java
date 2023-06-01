package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Pessoa;

public class Repositorio {
	
	private ArrayList<Pessoa> pessoas;

	public Repositorio() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	
	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}
		
	public void removePessoa(Pessoa p){
		pessoas.remove(p);
	}
	
}
