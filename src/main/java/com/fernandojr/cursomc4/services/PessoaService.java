package com.fernandojr.cursomc4.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandojr.cursomc4.domain.Pessoa;
import com.fernandojr.cursomc4.exceptions.ObjectNotFoundException;
import com.fernandojr.cursomc4.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscarPessoaPorId(Integer id) {
		Optional<Pessoa> obj = pessoaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pessoa.class.getName() ));
	}

}
