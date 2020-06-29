package com.fernandojr.cursomc4.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernandojr.cursomc4.domain.Pessoa;
import com.fernandojr.cursomc4.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarPessoaPorId(@PathVariable Integer id) {
		Pessoa obj = pessoaService.buscarPessoaPorId(id);
		
		return ResponseEntity.ok().body(obj);
		
	}


}
