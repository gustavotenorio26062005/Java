
public class Analista extends Funcionario{
	
	private String linguagem;

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	@Override
	public double bonus() {
		
		return super.getSalario()*5;
	}

	public Analista(String linguagem, String nome, double salario) {
		super.setNome(nome);
		super.setSalario(salario);
		this.linguagem = linguagem;
	}
	
	

}
