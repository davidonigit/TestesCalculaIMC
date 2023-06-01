package br.ufrn.imd.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	
	protected String nome;
	protected Date dataNascimento;
	protected double peso;
	protected double altura;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataEntrada) throws ParseException {
		this.dataNascimento = sdf.parse(dataEntrada);
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public abstract String calculaIMC();
	
	public String toString() {
		String impressao;
		System.out.println("--------------------------------------------------------");
		impressao = "Nome: " + getNome() + "\nData de Nascimento: " + sdf.format(getDataNascimento()) +
				"\nPeso: " + getPeso() + "\nAltura:" + getAltura();
		return impressao;
	}
	
}
