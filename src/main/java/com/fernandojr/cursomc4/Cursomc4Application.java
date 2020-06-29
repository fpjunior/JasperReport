package com.fernandojr.cursomc4;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fernandojr.cursomc4.domain.Categoria;
import com.fernandojr.cursomc4.domain.Pessoa;
import com.fernandojr.cursomc4.repositories.CategoriaRepository;
import com.fernandojr.cursomc4.repositories.PessoaRepository;

@SpringBootApplication
public class Cursomc4Application implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		
	
	Categoria cat1 = new Categoria(null, "casa");
	Categoria cat2 = new Categoria(null, "albhi");
	Categoria cat3 = new Categoria(null, "pessoal");
	Categoria cat4 = new Categoria(null, "carro");
	Categoria cat5 = new Categoria(null, "musica");
	Categoria cat6 = new Categoria(null, "outros");
//	
	Pessoa p1 = new Pessoa(1, "Fernando");
	Pessoa p2 = new Pessoa(2, "Bebel");
//	
	cat1.getPessoas().addAll(Arrays.asList(p1, p2));
	cat2.getPessoas().addAll(Arrays.asList(p1, p2));
	cat3.getPessoas().addAll(Arrays.asList(p1));
	cat4.getPessoas().addAll(Arrays.asList(p1, p2));
	cat5.getPessoas().addAll(Arrays.asList(p1));
	
	p1.getCategoria().addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
	p2.getCategoria().addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat6));
	
	categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
	pessoaRepository.saveAll(Arrays.asList(p1,p2));
	}
	
}

