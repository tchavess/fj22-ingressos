package br.com.caelum.ingresso.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
<<<<<<< HEAD

@Entity
public class Sessao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Entity
public class Sessao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
	private Integer id;
	private LocalTime horario;
	@ManyToOne
	private Sala sala;
	@ManyToOne
	private Filme filme;
	
	public Sessao() {
		
	}
<<<<<<< HEAD
	 
	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
=======
	
	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.filme = filme;
		this.sala =  sala;
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
<<<<<<< HEAD

=======
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
}
