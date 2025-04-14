
public class Carro {
	private int ano;
	private String cor;
	Motorista responsavel;
	
	
	
	public Carro(int ano, String cor) {
		super();
		this.ano = ano;
		this.cor = cor;
	}

	public Motorista getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Motorista responsavel) {
		this.responsavel = responsavel;
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
