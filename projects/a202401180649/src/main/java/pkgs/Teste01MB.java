package pkgs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
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

	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void cadastrar() {
		System.out.println("Teste01MB.cadastrar()");
		System.out.println("[this.login="+this.login+"][this.nome="+this.nome+"]");
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado !"));
	}

	public void verificarDisponibilidadeLogin() {
		System.out.println("Teste01MB.verificarDisponibilidadeLogin()");
		
		FacesMessage msg = null;
		
		if("joao".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage("Login \""+this.login+"\" já em uso");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		} else {
			msg = new FacesMessage("Login \""+this.login+"\" disponível");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void teste() {
		System.out.println("Teste01MB.teste()");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
