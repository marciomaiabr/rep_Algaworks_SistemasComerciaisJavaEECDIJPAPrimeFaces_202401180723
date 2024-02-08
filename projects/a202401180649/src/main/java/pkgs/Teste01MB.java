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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void mtd1() {
		System.out.println("Teste01MB.mtd1()");
		
		FacesContext.getCurrentInstance().addMessage("destino1", new FacesMessage(FacesMessage.SEVERITY_INFO, "desc summary for SEVERITY_INFO", "desc detail for SEVERITY_INFO"));
	}

	public void mtd2() {
		System.out.println("Teste01MB.mtd2()");
		
		FacesContext.getCurrentInstance().addMessage("destino2", new FacesMessage(FacesMessage.SEVERITY_WARN, "desc summary for SEVERITY_WARN", "desc detail for SEVERITY_WARN"));
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
