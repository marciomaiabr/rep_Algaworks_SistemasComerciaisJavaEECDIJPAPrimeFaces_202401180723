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

	private List<String> paises = new ArrayList<>();

	public Teste01MB() {
		System.out.println("Teste01MB.Teste01MB()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01MB.postConstruct()");
		paises.add("Alemanha");
		paises.add("Argélia");
		paises.add("Argentina");
		paises.add("Belgica");
		paises.add("Bélgica2");
		paises.add("Bolivia");
		paises.add("Brasil");
		paises.add("brasil2");
		paises.add("Bulgaria");
		paises.add("Espanha");
		paises.add("Estados Unidos");
	}

	public String getMBVersion() {
		return "20240118_0809";
	}

	private String nome;
	private String pais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.pais=" + this.pais + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	public List<String> sugerirPaises(String query) {
		System.out.println("Teste01MB.sugerirPaises()");
		System.out.println("[this.nome=" + this.nome + "][this.pais=" + this.pais + "][query=" + query + "]");

		List<String> paisSugerido = new ArrayList<>();

		for(String pais : paises) {
			if(pais.toUpperCase().startsWith(query.toUpperCase()))
				paisSugerido.add(pais);
		}

		return paisSugerido;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
