package pkgs.services;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;

@RequestScoped
@Default
public class Teste01ServiceImp01 implements Serializable, Teste01Service {

	private static final long serialVersionUID = 20240210062701L;

	public Teste01ServiceImp01() {
		System.out.println("Teste01ServiceImp01.()[" + serialVersionUID + "][" + (((Object) this).toString()) + "]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("     " + "     " + "[annotation=" + annotation.annotationType().getName() + "]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01ServiceImp01.postConstruct()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public long getSerialversionuid() {
		System.out.println("Teste01ServiceImp01.getSerialversionuid()");
		return serialVersionUID;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01ServiceImp01.preDestroy()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01ServiceImp01.finalize()[" + (((Object) this).toString()) + "]");
	}

}
