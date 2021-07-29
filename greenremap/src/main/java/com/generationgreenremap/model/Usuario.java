package com.generationgreenremap.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo Nome é Obrigatório!")
	@Size(min = 5, max = 100)
	private String nome;
	
	@NotNull(message = "O atributo E-mail é Obrigatório!")
	@Size(min = 5, max = 100)
	private String email;
	
	@NotNull(message = "O atributo Senha é Obrigatório!")
	@Size(min = 8, max = 700)
	private String senha;
	
	@NotNull(message = "O atributo Endereço é Obrigatório!")
	@Size(min = 5, max = 700)
	private String endereco;
	
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("Usuario")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
}
