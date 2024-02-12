package com.algaworks.pedidovenda.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 20240212074800L;

	public void salvar() {
		System.out.println("CadastroProdutoBean.salvar()");
		throw new RuntimeException("Teste de exceção...");
	}
	
}
