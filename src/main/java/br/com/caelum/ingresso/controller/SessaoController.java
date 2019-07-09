package br.com.caelum.ingresso.controller;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import br.caelum.ingresso.validacao.GerenciadorDeSessao;
=======
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.form.SessaoForm;

@Controller
public class SessaoController {
	@Autowired
	private SalaDao salaDao;
	@Autowired
	private FilmeDao filmeDao;
<<<<<<< HEAD
=======
	
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
	@Autowired
	private SessaoDao sessaoDao;
	
	@GetMapping("/admin/sessao")
	public ModelAndView form(@RequestParam("salaId") Integer salaId, SessaoForm form) {
		
		ModelAndView modelAndView = new ModelAndView("sessao/sessao");
		
		modelAndView.addObject("sala", salaDao.findOne(salaId));
		modelAndView.addObject("filmes", filmeDao.findAll());
		modelAndView.addObject("form", form);
		
		return modelAndView;
	}
	
<<<<<<< HEAD
/*	@PostMapping(value = "/admin/sessao")
	@Transactional
	public ModelAndView salva(@Valid SessaoForm form, BindingResult result) {
		
		if(result.hasErrors()) {
			return form(form.getSalaId(),form);
=======
	@PostMapping()
	@Transactional
	public ModelAndView salva(@Valid SessaoForm form, BindingResult result) {
		
		if(result.hasErrors()){
			return form(form.getSalaId(), form);
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
		}
		
		Sessao sessao = form.toSessao(salaDao, filmeDao);
		
		sessaoDao.save(sessao);
<<<<<<< HEAD
		
		return new ModelAndView("redirect:/admin/sala/" + form.getSalaId() + "/sessoes");
		
	}*/
	
	@PostMapping("/admin/sessao")
	@Transactional
	public ModelAndView salva(@Valid SessaoForm form, BindingResult result) {
		if(result.hasErrors()) return form(form.getSalaId(), form);
		
		Sessao sessao = form.toSessao(salaDao, filmeDao);
		
		List<Sessao> sessoesDaSala = sessaoDao.buscaSessoesDaSala(sessao.getSala());
		
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoesDaSala);
		
		if(gerenciador.cabe(sessao)) {
			sessaoDao.save(sessao);
			return new ModelAndView("redirect:/admin/sala/" + form.getSalaId() + "/sessoes");
		}
		return form(form.getSalaId(), form);
	}

=======
		return new ModelAndView("redirect:/admin/sala/" + form.getSalaId() + "/sessoes");
	}
>>>>>>> 1aeaa957a9ad5f76b0c67252c3849c11bfd9d3cc
}
