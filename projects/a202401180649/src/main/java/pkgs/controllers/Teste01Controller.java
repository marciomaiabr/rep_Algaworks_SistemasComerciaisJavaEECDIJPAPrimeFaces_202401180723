package pkgs.controllers;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pkgs.services.Teste01Service;

@Named
@RequestScoped
public class Teste01Controller implements Serializable {

	private static final long serialVersionUID = 20240210061700L;

	@Inject
	private Teste01Service teste01Service;

	private long longTeste01ServiceSerialVersionUID;

	public Teste01Controller() {
		System.out.println("Teste01Controller.()[" + serialVersionUID + "][" + (((Object) this).toString()) + "]");

		Annotation[] annotations = this.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("     " + "     " + "[annotation=" + annotation.annotationType().getName() + "]");
		}
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01Controller.postConstruct()");
	}

	public String getSerialversionuid() {
		return this.getClass().getName() + "-" + serialVersionUID;
	}

	public long getLongTeste01ServiceSerialVersionUID() {
		return longTeste01ServiceSerialVersionUID;
	}

	public void applyLongTeste01ServiceSerialVersionUID() {
		longTeste01ServiceSerialVersionUID = this.teste01Service.getSerialversionuid();
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01Controller.preDestroy()");
	}

	@Override
	public void finalize() {
		System.out.println("Teste01Controller.finalize()");
	}

}
