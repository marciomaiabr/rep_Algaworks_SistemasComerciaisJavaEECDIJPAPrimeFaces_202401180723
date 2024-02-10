package pkgs.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Produces;

import pkgs.qualifiers.Teste01Qualifier02;

public class FormatadorData {

	public FormatadorData() {
		System.out.println("FormatadorData.()[" + (((Object) this).toString()) + "]");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("FormatadorData.postConstruct()[" + (((Object) this).toString()) + "]");
	}

	@Produces
	public DateFormat formatadorDataBrasil() {
		System.out.println("FormatadorData.formatadorDataBrasil()[" + (((Object) this).toString()) + "]");
		return new SimpleDateFormat("dd 'de' MMM 'de' yyyy", new Locale("pt", "BR"));
	}

	@Produces @Teste01Qualifier02
	public DateFormat formatadorDataEUA() {
		System.out.println("FormatadorData.formatadorDataEUA()[" + (((Object) this).toString()) + "]");
		return new SimpleDateFormat("MMM dd, yyyy", Locale.US);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("FormatadorData.preDestroy()[" + (((Object) this).toString()) + "]");
	}

	@Override
	public void finalize() {
		System.out.println("FormatadorData.finalize()[" + (((Object) this).toString()) + "]");
	}

}
