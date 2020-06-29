package com.fernandojr.cursomc4.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

//Anotação Entity para transformar objetos java em entidades/tabelas de banco de dados e vice-versa
@Entity
@AllArgsConstructor
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="ID", unique = true, nullable = false, precision = 10, scale = 0)
	private Integer id;
	
	@Column (name="NOME", unique = true, nullable = false, precision = 10, scale = 0)
	private String nome;
	
//	associação de Pessoa e Categoria
	@ManyToMany
			@JoinTable(name =  "PESSOA_CATEGORIA",
			joinColumns = @JoinColumn(name = "pessoa_id"),
			inverseJoinColumns = @JoinColumn(name = "categoria_id"))
			
	private List<Categoria> categorias = new ArrayList<>();
	
	
	public Pessoa() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public List<Categoria> getCategoria() {
		return categorias;
	}


	public void setPessoas(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
}
