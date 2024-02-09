package pkgs.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.lang.annotation.Annotation;

@Dependent
public class CalculadoraPreco implements Serializable {

	private static final long serialVersionUID = 202402090823L;

	public CalculadoraPreco() {
		System.out.println("CalculadoraPreco.Constructor()["+serialVersionUID+"]["+(((Object)this).toString())+"]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for(Annotation annotation : annotations) {
			System.out.println("     "+"     "+"[annotation="+annotation.annotationType().getName()+"]");
		}
	}

	@PostConstruct
	public void init() {
		System.out.println("CalculadoraPreco.init()["+(((Object)this).toString())+"]");
	}

	public double calculaPreco(int quantidade, double precoUnitario) {
		System.out.println("CalculadoraPreco.calculaPreco()["+(((Object)this).toString())+"]");
		return quantidade * precoUnitario;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("CalculadoraPreco.preDestroy()["+(((Object)this).toString())+"]");
	}

	@Override
	public void finalize() {
		System.out.println("CalculadoraPreco.finalize()["+(((Object)this).toString())+"]");
	}

}
