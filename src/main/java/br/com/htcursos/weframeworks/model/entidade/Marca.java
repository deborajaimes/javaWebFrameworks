package br.com.htcursos.weframeworks.model.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Marca {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	
	@OneToMany(mappedBy="montadora")
	private List<Modelo> modelos = new ArrayList<>();
	
	@OneToOne(mappedBy="montadora")
	private DetalheMarca detalheMarca;
	
	public Marca() {
	}
	
	public Marca(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
