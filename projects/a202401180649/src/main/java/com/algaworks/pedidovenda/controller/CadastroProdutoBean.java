package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	
	private List<Categoria> categoriasRaizes;
	
	public CadastroProdutoBean() {
		produto = new Produto();
	}

	public void inicializar() {
		System.out.println("CadastroProdutoBean.inicializar()");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();
		
		categoriasRaizes = manager.createQuery("from Categoria", Categoria.class).getResultList();
		
		manager.close();
	}
	
	public void salvar() {
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}

}