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
	private List<String> interesses;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "]");
		this.interesses.forEach(System.out::println);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
