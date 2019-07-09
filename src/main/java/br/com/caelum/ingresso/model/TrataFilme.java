package br.com.caelum.ingresso.model;

import java.time.Duration;

public class TrataFilme {
	
	public static void main(String[] args) {
		Filme filme = new FilmeBuilder().comDuracao(Duration.ofMinutes(60)).comNome("XXX").comGenero("FICCAO").build();
		
		System.out.println(filme);
	}

}
