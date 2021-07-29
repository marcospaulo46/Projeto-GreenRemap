package com.generationgreenremap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome do produto é Obrigatório")
	@Size(min = 5, max = 100)
	private String nome_produto;
	
	@NotNull(message = "O atributo valor é Obrigatório")
	private double valor;
	
	@Size(min = 5, max = 10000)
	private String descricao;
	
	@NotNull(message = "O atributo quantidade é Obrigatório")
	private int quantidade;
	
	@NotNull(message = "O atributo espécie é Obrigatório")
	@Size(min = 5, max = 100)
	private String especie;
	
	@NotNull(message = "O atributo tamanho é Obrigatório")
	@Size(min = 5, max = 100)
	private String tamanho;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
