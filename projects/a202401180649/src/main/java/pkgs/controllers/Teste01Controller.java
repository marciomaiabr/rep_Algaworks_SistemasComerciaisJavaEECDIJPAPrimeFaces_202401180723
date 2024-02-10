package pkgs.controllers;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pkgs.qualifiers.Teste01Qualifier01;
import pkgs.services.Teste01Service;

@Named
@ViewScoped
public class Teste01Controller implements Serializable {

	private static final long serialVersionUID = 20240210090302L;

	private List<String> produtos;
	private String produto;

	public Teste01Controller() {
		System.out.println("Teste01Controller.()[" + serialVersionUID + "][" + (((Object) this).toString()) + "]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("     " + "     " + "[annotation=" + annotation.annotationType().getName() + "]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01Controller.postConstruct()");
		produtos = new ArrayList<>();
	}

	public List<String> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<String> produtos) {
		this.produtos = produtos;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void adicionar() {
		System.out.println("Teste01Controller.adicionar()");
		produtos.add(produto);
		produto = null;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01Controller.preDestroy()");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01Controller.finalize()");
	}

}
