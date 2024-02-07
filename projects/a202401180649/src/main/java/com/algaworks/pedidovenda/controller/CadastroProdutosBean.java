package com.algaworks.pedidovenda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroProdutosBean {

	private Float vu;

	public Float getVu() {
		return vu;
	}

	public void setVu(Float vu) {
		this.vu = vu;
	}

	public void salvar() {
		System.out.println("CadastroProdutosBean.salvar()");
		System.out.println("[this.vu="+this.vu+"]");
	}

}
