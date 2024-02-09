package pkgs;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Teste01MB implements Serializable {

	private static final long serialVersionUID = 202402090906L;

	public Teste01MB() {
		System.out.println("Teste01MB.Constructor()["+serialVersionUID+"]["+(((Object)this).toString())+"]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for(Annotation annotation : annotations) {
			System.out.println("     "+"     "+"[annotation="+annotation.annotationType().getName()+"]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01MB.postConstruct()");
	}

	public String getMBVersion() {
		return "20240118_0809";
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01MB.preDestroy()");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01MB.finalize()");
	}

}
