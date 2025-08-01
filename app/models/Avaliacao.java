package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Avaliacao extends Model{
	public String mensagem;
	public String usuario;
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	@ManyToOne
	public Produto produto;
	
	
	public Avaliacao(String mensagem, String usuario, Produto p) {
		super();
		this.mensagem = mensagem;
		this.usuario = usuario;
		this.status = Status.ATIVO;
		this.produto = p;
	}
	
	public Avaliacao() {
		this.status = Status.ATIVO;
	}

	
	
	
}
