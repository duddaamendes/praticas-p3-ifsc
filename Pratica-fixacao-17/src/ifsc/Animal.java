package ifsc;

public class Animal {
	private String nome;
	private String raca;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public static void caminho(){
		
	}

	private Float comprimento;
	private Integer numeroPatas;
	private String cor;
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	private String ecossistema;
	
	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(Integer numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getEcossistema() {
		return ecossistema;
	}

	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}

}
