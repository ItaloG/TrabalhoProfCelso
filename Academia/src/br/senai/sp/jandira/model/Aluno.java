package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	
	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private LocalDate dataDeNascimento;
	private char nivelDeAtividade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSexo(char sexo) {
		this.sexo= sexo;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
//	public void setNivelDeAtividade(char nivelDeAtividade) {
//		this.nivelDeAtividade = nivelDeAtividade;
//	}
//	
//	public char getNivelDeAtividade() {
//		return this.nivelDeAtividade;
//	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade(){
		LocalDate hoje  = LocalDate.now();
		Period periodo = Period.between(this.dataDeNascimento, hoje);
		 
		return periodo;
	}

}
