package com.generationgreenremap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo nome da categoria é Obrigatório!")
	@Size(min = 5, max = 100)
	private String nome_categoria;
	
	@Size(min = 5, max = 100, message = "O atributo caracteristica deve conter no mínimo 5 e no  máximo 100 caracteres")
	private String palavra_chave;
	
	@Size(min = 5, max = 5000, message = "O atributo caracteristica deve conter no mínimo 5 e no  máximo 500 caracteres")
	private String caracteristica;
	
	

}
