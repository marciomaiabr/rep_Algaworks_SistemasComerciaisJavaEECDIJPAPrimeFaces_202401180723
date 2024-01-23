package pkgs;

import java.util.ArrayList;
import java.util.Date;
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

	public static final List<Interesse> INTERESSES = new ArrayList<>();
	static {
		System.out.println("Teste01MB.enclosing_method()");
		INTERESSES.add(new Interesse("Esportes","esportes"));
		INTERESSES.add(new Interesse("Computação","computacao"));
		INTERESSES.add(new Interesse("Cinema","cinema"));
		INTERESSES.add(new Interesse("Leitura","leitura"));
	}

	public Teste01MB() {
		System.out.println("Teste01MB.Teste01MB()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01MB.postConstruct()");
	}

	public String getMBVersion() {
		return "20240118_0809";
	}

	private String nome;
	private String profissao;
	private Interesse interesse;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.profissao=" + this.profissao + "][this.interesse=" + this.interesse + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	public List<Interesse> getInteresses(){
		System.out.println("Teste01MB.getInteresses()");
		return INTERESSES;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
