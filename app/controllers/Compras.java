package controllers;

import java.util.List;

import models.Produto;
import play.mvc.Controller;

public class Compras extends Controller{
	
	//página principal
	public static void principal() {
		render();
	}
	
	//Página de produtos 
	public static void produtos() {
		List<Produto> produtos = Produto.findAll();
		render(produtos);
	}
}
