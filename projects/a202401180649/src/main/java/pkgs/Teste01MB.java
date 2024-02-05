package pkgs;

import java.util.ArrayList;
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
	private String telefone;
	private String telefoneComercial;
	private String matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.telefone=" + this.telefone + "][this.telefoneComercial=" + this.telefoneComercial + "][this.matricula=" + this.matricula + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
