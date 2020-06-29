package com.fernandojr.cursomc4.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernandojr.cursomc4.domain.Categoria;
import com.fernandojr.cursomc4.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	
//	Foi criado um metodo "public List<Categoria>" para chamar uma lista de categorias
//	a anotação PathVariable informa que esse metodo vai receber o id que vai vir na url, o id da url vai para o id da variável
//	o ResponseEntity já encapsula informações de uma resposta http para um serviço REST, o <?> informa que ele pode ser de qualquer tipo
//	que pode encontrar ou não um objeto com o id informado

		
//		o retorno ResponseEntity.ok informa que a operação ocorreu com sucesso e a resposta vai ter como corpo o objeto obj que foi buscado
//		no service

		
////		Criando as categorias
//		Categoria categoria1 = new Categoria(1, "Casa");
//		Categoria categoria2 = new Categoria(2, "Albhi");
//		Categoria categoria3 = new Categoria(3, "Pessoal");
//		
////		Criando uma lista de categorias - O list é uma inteface e não pode ser instanciada, por isso a classe ArrayList
//		List<Categoria> listaCategoria = new ArrayList<>();
//		listaCategoria.add(categoria1);
//		listaCategoria.add(categoria2);
//		listaCategoria.add(categoria3);
//		
////		Adcionando dados na lista criada
//		
//		
//		return listaCategoria;
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarCategoriaPorId(@PathVariable Integer id) {
		Categoria obj = categoriaService.buscarCategoriaPorId(id);
		return ResponseEntity.ok().body(obj);
	}


}
