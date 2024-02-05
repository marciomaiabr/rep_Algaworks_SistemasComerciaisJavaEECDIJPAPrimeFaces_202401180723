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

	public static final List<Pais> PAISES = new ArrayList<>();
	static {
		PAISES.add(new Pais(1, "Alemanha"));
		PAISES.add(new Pais(2, "Argélia"));
		PAISES.add(new Pais(3, "Argentina"));
		PAISES.add(new Pais(4, "Bélgica"));
		PAISES.add(new Pais(5, "Bolívia"));
		PAISES.add(new Pais(6, "Brasil"));
		PAISES.add(new Pais(7, "Bulgaria"));
		PAISES.add(new Pais(8, "Espanha"));
		PAISES.add(new Pais(9, "Estados Unidos"));
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
	private Pais pais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void atualizar() {
		System.out.println("Teste01MB.atualizar()");
		System.out.println("[this.nome=" + this.nome + "][this.pais=" + this.pais + "]");

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado !"));
	}

	public List<Pais> sugerirPaises(String consulta) {
		System.out.println("Teste01MB.sugerirPaises()");

		List<Pais> paisesSugeridos = new ArrayList<>();
		for(Pais pais : PAISES) {
			if(pais.getNome().toUpperCase().startsWith(consulta.toUpperCase())) {
				paisesSugeridos.add(pais);
			}
		}

		return paisesSugeridos;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
