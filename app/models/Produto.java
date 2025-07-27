package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import play.db.jpa.Model;

@Entity
public class Produto extends Model{
	public String nome;
	public String descricao;
	public Double preco;
	public String foto;
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	public Produto(String nome, String descricao, Double preco, Status status,String foto) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.status = status;
		this.foto = foto;
	}
	
	
	
	
}
