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

		funcionarios = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			adicionarFuncionario();
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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





	private static final String[] nomes = { "João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco",
			"Manoel", "Fernanda", "Gabriela", "Mário", "Marcos" };
		
		private static final String[] sobrenomes = { "Souza", "Silva", "Andrade", "Machado", "Júnior", "Albuquerque",
			"Alencar", "Assis", "Batista", "Camargo", "Coelho", "Costa", "Dias", "Rosa", "Leal", "Lima", "Leite" };
		
		private List<Funcionario> funcionarios;

		private void adicionarFuncionario() {
			String nomeCompleto = getNomeAleatorio() + " " + getSobrenomeAleatorio() + " " + getSobrenomeAleatorio();
			funcionarios.add(new Funcionario(getMatriculaAleatoria(), nomeCompleto, getDataAleatoria(), 
					getSalarioAleatorio()));
		}
		
		private BigDecimal getSalarioAleatorio() {
			return new BigDecimal(1000 + (Math.random() * 29000));
		}
		
		private Long getMatriculaAleatoria() {
			return (long) (Math.random() * 10000);
		}
		
		private Date getDataAleatoria() {
			long dezAnosEmMillis = 24 * 60 * 60 * 1000;
			long periodoSorteadoEmMillis = ((long) (Math.random() * 10 * 365)) * dezAnosEmMillis;
			return new Date(System.currentTimeMillis() - periodoSorteadoEmMillis);
		}
		
		private String getSobrenomeAleatorio() {
			int posicao = (int) Math.round(Math.random() * (sobrenomes.length - 1));
			return sobrenomes[posicao];
		}
		
		private String getNomeAleatorio() {
			int posicao = (int) Math.round(Math.random() * (nomes.length - 1));
			return nomes[posicao];
		}

		public List<Funcionario> getFuncionarios() {
			System.out.println("Teste01MB.getFuncionarios()");
			return funcionarios;
		}

}
