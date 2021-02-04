package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	
	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private LocalDate dataDeNascimento;
	private int nivelDeAtividade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSexo(char sexo) {
		if (sexo == 'm') {
			this.sexo = 'm';
		}else {
			if (sexo == 'f') {
				this.sexo = 'f';
			}
		}
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
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}

	public void setNivelDeAtividade(int nivelDeAtividade) {
		if (nivelDeAtividade == 0) {
			this.nivelDeAtividade = 0;//nenhuma
		}else {
			if (nivelDeAtividade == 1) {
				this.nivelDeAtividade = 1;//leve
			}else {
				if (nivelDeAtividade == 2) {
					this.nivelDeAtividade = 2;//moderada
				}else {
					if (nivelDeAtividade == 3) {
						this.nivelDeAtividade = 3;//intensa
					}
				}
			}
		}
	}
	
	public int getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) { //representa: LocalDate dataDeNascimento = LocalDate.algumaCoisa 
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade(){
		LocalDate hoje  = LocalDate.now(); //guarda a data atual baseada no computador
		Period periodo = Period.between(this.dataDeNascimento, hoje); //retorna um periodo, esse perido � seu tempo de vida.
		 
		return periodo.getYears();
	}
	
	public double getImc() {
		return this.peso/Math.pow(this.altura, 2);
	}
	
	public String getStatusImc() {
		if (getImc() <= 18.5 ) {
			return "Abaixo do peso";
		} else {
			if (getImc() >= 18.6 && getImc() <= 24.9) {
				return "Peso ideal(Parabens)";
			}else {
				if (getImc() >= 25 && getImc() <= 29.9) {
					return "Levemente acima do peso";
				}else {
					if (getImc() >= 30 && getImc() <= 34.9) {
						return "Obesidade grau I";
					}else {
						if (getImc() >= 35 && getImc() <= 39.9) {
							return "Obesidade grau II (Severa)";
						}else {
								return "Obesidade grau III (M�rbida)";
						}
					}
				}
			}
		}
	}
	
	public double getNcd() {
		if (getIdade() >= 18) {
			return (double) (15.3 * peso + 679);
		}
	}
}
