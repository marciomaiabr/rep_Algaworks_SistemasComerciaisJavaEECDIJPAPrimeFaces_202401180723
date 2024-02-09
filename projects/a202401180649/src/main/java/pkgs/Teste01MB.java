package pkgs;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Teste01MB implements Serializable {

	private static final long serialVersionUID = 202402090816L;

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

	public void finalizarSessao() {
		System.out.println("Teste01MB.finalizarSessao()");

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
	    try {
			externalContext.redirect("https://www.google.com/");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
