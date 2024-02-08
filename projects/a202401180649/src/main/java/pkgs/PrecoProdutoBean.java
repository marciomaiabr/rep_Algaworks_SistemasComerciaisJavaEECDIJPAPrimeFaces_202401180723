package pkgs;

import javax.inject.Inject;
import javax.inject.Named;

import pkgs.service.CalculadoraPreco;

@Named("meuBean")
public class PrecoProdutoBean {

	@Inject
	private CalculadoraPreco calculadora;

	public double getPreco() {
		return calculadora.calculaPreco(12, 44.55);
	}

}
