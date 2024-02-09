package pkgs.services;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Teste01Service implements Serializable {

	private static final long serialVersionUID = 202402090958L;

	public Teste01Service() {
		System.out.println("Teste01Service.()[" + serialVersionUID + "][" + (((Object) this).toString()) + "]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("     " + "     " + "[annotation=" + annotation.annotationType().getName() + "]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01Service.postConstruct()[" + (((Object) this).toString()) + "]");
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01Service.preDestroy()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01Service.finalize()[" + (((Object) this).toString()) + "]");
	}

}
