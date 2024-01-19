package pkgs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;

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

	private String nome;
	private String nomeInvertido;
	private int quantidadePalavras;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInvertido() {
		return nomeInvertido;
	}

	public int getQuantidadePalavras() {
		return quantidadePalavras;
	}

	public void inverter() {
		System.out.println("Teste01MB.inverter()");

		this.nomeInvertido = "";
		this.quantidadePalavras = 0;

		if (this.nome != null && !this.nome.isEmpty()) {
			this.quantidadePalavras = 1;
		}

		for (int i = this.nome.length() - 1; i >= 0; i--) {
			char letra = this.nome.charAt(i);
			this.nomeInvertido += letra;

			if (letra == ' ')
				this.quantidadePalavras++;

		}

		System.out.println("[this.nomeInvertido=" + this.nomeInvertido + "]");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

}
