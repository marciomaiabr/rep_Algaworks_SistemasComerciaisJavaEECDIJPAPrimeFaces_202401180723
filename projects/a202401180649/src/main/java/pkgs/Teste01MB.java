package pkgs;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Teste01MB implements Serializable {

	private static final long serialVersionUID = -7424888261504715069L;

	public Teste01MB() {
		System.out.println("Teste01MB.Teste01MB()");

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
