package dia2509;

public class Estado {

	private String nome;
	private String sigla;
	public void estado(String nome, String sigla) {
	this.nome = nome;
	this.sigla = sigla;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getsigla() {
	return sigla;
	}
	public void setsigla(String sigla) {
	this.sigla = sigla;
	}
}
