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
	private String sobre;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public List<String> completarTexto(String consulta){
		System.out.println("Teste01MB.completarTexto()");
		System.out.println("[consulta="+consulta+"]");
		List<String> resultado = new ArrayList<>();
		
		if(consulta.toUpperCase().startsWith("MA")) {
			resultado.add("Marcio");
			resultado.add("Marcio Maia");
			resultado.add("Marcio Luis B. Maia");
			resultado.add("Marcio Luis Borges Maia");
		}
		
		return resultado;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.sobre=" + this.sobre + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
