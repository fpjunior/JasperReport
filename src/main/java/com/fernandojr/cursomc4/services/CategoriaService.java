package com.fernandojr.cursomc4.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandojr.cursomc4.domain.Categoria;
import com.fernandojr.cursomc4.exceptions.ObjectNotFoundException;
import com.fernandojr.cursomc4.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
//	Anotação Autowired faz com que as dependencias sejam automaticamente estanciada pelo spring, pelo mecanismo de injeção de 
//	depencia ou inversão de controles
//	O metodo abaixo precisa receber um id como parametro
//	ele fara uma busca por id
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarCategoriaPorId(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
