package pkgs.services;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pkgs.qualifiers.Teste01Qualifier01;

@RequestScoped
@Teste01Qualifier01
public class Teste01ServiceImp02 implements Serializable, Teste01Service {

	private static final long serialVersionUID = 20240210062702L;

	@Inject
	private DateFormat dateFormat;

	public Teste01ServiceImp02() {
		System.out.println("Teste01ServiceImp02.()[" + serialVersionUID + "][" + (((Object) this).toString()) + "]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("     " + "     " + "[annotation=" + annotation.annotationType().getName() + "]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01ServiceImp02.postConstruct()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public long getSerialversionuid() {
		System.out.println("Teste01ServiceImp02.getSerialversionuid()");
		System.out.println("[dateFormat.format(new Date())="+dateFormat.format(new Date())+"]");
		return serialVersionUID;
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01ServiceImp02.preDestroy()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01ServiceImp02.finalize()[" + (((Object) this).toString()) + "]");
	}

}
