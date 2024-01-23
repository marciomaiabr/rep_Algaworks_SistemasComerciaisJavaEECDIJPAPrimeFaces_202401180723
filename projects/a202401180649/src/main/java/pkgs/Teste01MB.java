package pkgs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Teste01MB {

	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();

	public Teste01MB() {
		System.out.println("Teste01MB.Teste01MB()");
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
	}

	public void carregarCidades() {
		System.out.println("Teste01MB.carregarCidades()");

		cidades.clear();

		if ("MG".equals(this.estado)) {
			this.cidades.add("Belo");
			this.cidades.add("Beraba");
			this.cidades.add("Berlandia");
		} else if ("SP".equals(this.estado)) {
			this.cidades.add("Santos");
			this.cidades.add("Guarulhos");
			this.cidades.add("Diadema");
		} else if ("RJ".equals(this.estado)) {
			this.cidades.add("Rio");
			this.cidades.add("Niteroi");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01MB.postConstruct()");
	}

	public String getMBVersion() {
		return "20240118_0809";
	}

	private String nome;
	private String estado;
	private String cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.estado=" + this.estado + "][this.cidade=" + this.cidade + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
