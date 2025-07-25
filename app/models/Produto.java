package models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Produto {
	public String nome;
	public String descricao;
	public Double preco;
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	
}
