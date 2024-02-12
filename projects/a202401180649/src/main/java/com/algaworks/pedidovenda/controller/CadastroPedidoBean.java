package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.service.NegocioException;

@Named
@RequestScoped
public class CadastroPedidoBean {

	private List<Integer> itens;
	
	public CadastroPedidoBean() {
		itens = new ArrayList<>();
		itens.add(1);
	}

	public void salvar() {
		System.out.println("CadastroPedidoBean.salvar()");
		throw new NegocioException("Pedido não pode ser salvo.");
	}
	
	public List<Integer> getItens() {
		return itens;
	}
	
}