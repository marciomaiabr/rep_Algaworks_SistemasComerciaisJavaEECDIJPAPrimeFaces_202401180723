package pkgs;

public class Interesse {

	private String descricao;
	private String nomeIcone;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeIcone() {
		return nomeIcone;
	}

	public void setNomeIcone(String nomeIcone) {
		this.nomeIcone = nomeIcone;
	}

	@Override
	public String toString() {
		return "Interesse [descricao=" + descricao + ", nomeIcone=" + nomeIcone + "]";
	}

	public Interesse(String descricao, String nomeIcone) {
		super();
		this.descricao = descricao;
		this.nomeIcone = nomeIcone;
	}

}
