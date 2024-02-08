package pkgs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Teste01MB implements Serializable {

	private static final long serialVersionUID = -7424888261504715069L;

	private List<String> produtos = new ArrayList<>();
	private String nomeProduto;
	private String produtoSelecionado;

	public Teste01MB() {
		System.out.println("Teste01MB.Teste01MB()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01MB.postConstruct()");
		produtos.add("Arroz");
		produtos.add("Feijão");
		produtos.add("Queijo");
		produtos.add("Notbook");
	}

	public String getMBVersion() {
		return "20240118_0809";
	}

	public List<String> getProdutos() {
		return produtos;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(String produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public void incluirProduto() {
		System.out.println("Teste01MB.incluirProduto()");
		produtos.add(nomeProduto);
		nomeProduto = null;
	}

	public void excluirProduto() {
		System.out.println("Teste01MB.excluirProduto()");
		produtos.remove(produtoSelecionado);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
