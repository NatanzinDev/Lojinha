package controllers;

import java.util.List;

import models.Avaliacao;
import models.Produto;
import models.Status;
import play.mvc.Controller;

public class Compras extends Controller{
	
	//página principal
	public static void principal() {
		List<Produto> produtos = Produto.findAll();
		render(produtos);
	}
	
	//Página de produtos 
	public static void produtos() {
		List<Produto> produtos = Produto.findAll();
		render(produtos);
	}
	
	//salvar avaliação
	public static void salvaravaliacao(Avaliacao a) {
		
		Avaliacao avaliacao = a;
		avaliacao.save();
		principal();
	}
	
	//listar avaliações
	public static void avaliacoes(String busca) {
		List<Avaliacao> avaliacao;
		
	
		if(busca == null) {
			avaliacao = Avaliacao.find("status <> ?1", Status.INATIVO).fetch();
		}else {
			busca = busca.toLowerCase();
			avaliacao = Avaliacao.find("(lower(mensagem) like ?1 or lower(usuario) like ?1) and status <> ?2" , "%"+busca+"%",Status.INATIVO).fetch();
		}
		render(avaliacao,busca);
	}
	
	//exibir tela de edição
	public static void editaravaliacao(Long id) {
		Avaliacao a = Avaliacao.findById(id);
		
		render(a);
	}
	
	// função para editar
	public static void editando(Avaliacao a) {
		Avaliacao avaliacao = a;
		avaliacao.save();
		avaliacoes(null);
	}
	
	public static void deletar(Long id) {
		Avaliacao avaliacao = Avaliacao.findById(id);
		avaliacao.status = Status.INATIVO;
		avaliacao.save();
		avaliacoes(null);
	}
	
	public static void detalharproduto(Long id) {
		Produto produto = Produto.findById(id);
		List<Avaliacao> avaliacao = Avaliacao.find("byProduto_id", id).fetch();
		render(produto, avaliacao);
	}
	
	public static void contato() {
		render();
	}

	
	
	
}
