package pkgs;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pkgs.service.CalculadoraPreco;

@Named("meuBean")
@RequestScoped
public class PrecoProdutoBean implements Serializable {

	private static final long serialVersionUID = 202402090823L;

	@Inject
	private CalculadoraPreco calculadora;

	public PrecoProdutoBean() {
		System.out.println("PrecoProdutoBean.Constructor()["+serialVersionUID+"]["+(((Object)this).toString())+"]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for(Annotation annotation : annotations) {
			System.out.println("     "+"     "+"[annotation="+annotation.annotationType().getName()+"]");
		}
	}

	@PostConstruct
	public void init() {
		System.out.println("PrecoProdutoBean.init()["+(((Object)this).toString())+"]");
		System.out.println("     "+"[calculadora="+calculadora+"]");
	}

	public double getPreco() {
		System.out.println("PrecoProdutoBean.getPreco()["+(((Object)this).toString())+"]");
		System.out.println("     "+"[calculadora.getClass()="+calculadora.getClass()+"][calculadora="+calculadora+"]");
		return calculadora.calculaPreco(12, 44.55);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("PrecoProdutoBean.preDestroy()["+(((Object)this).toString())+"]");
	}

	@Override
	public void finalize() {
		System.out.println("PrecoProdutoBean.finalize()["+(((Object)this).toString())+"]");
	}

}
