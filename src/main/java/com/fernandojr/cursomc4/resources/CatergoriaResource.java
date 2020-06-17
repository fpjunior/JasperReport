package com.fernandojr.cursomc4.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernandojr.cursomc4.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
//	Foi criado um metodo "public List<Categoria>" para chamar uma lista de categorias
	public List<Categoria> listar() {
		
//		Criando as categorias
		Categoria categoria1 = new Categoria(1, "Casa");
		Categoria categoria2 = new Categoria(2, "Albhi");
		Categoria categoria3 = new Categoria(3, "Pessoal");
		
//		Criando uma lista de categorias - O list é uma inteface e não pode ser instanciada, por isso a classe ArrayList
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(categoria1);
		listaCategoria.add(categoria2);
		listaCategoria.add(categoria3);
		
//		Adcionando dados na lista criada
		
		
		return listaCategoria;
	}

}
