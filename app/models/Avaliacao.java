package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import play.db.jpa.Model;

@Entity
public class Avaliacao extends Model{
	public String mensagem;
	public String usuario;
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	public Avaliacao(String mensagem, String usuario) {
		super();
		this.mensagem = mensagem;
		this.usuario = usuario;
		this.status = Status.ATIVO;
	}

	
	
	
}
