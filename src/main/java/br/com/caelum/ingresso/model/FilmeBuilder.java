package br.com.caelum.ingresso.model;

import java.time.Duration;

public class FilmeBuilder {
	private String nome;
	private String genero;
	private Duration duracao;
	
	public FilmeBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public FilmeBuilder comGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public FilmeBuilder comDuracao(Duration duracao) {
		this.duracao = duracao;
		return this;
	}
	
	public Filme build() {
		return new Filme(nome,duracao,genero);
	}

}
