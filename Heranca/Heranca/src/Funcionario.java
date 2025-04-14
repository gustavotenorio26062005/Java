
public abstract  class Funcionario {
	private String nome;
	private String fone;
	private double salario;
	
	public  abstract double bonus ();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		if (salario>= 0)
			this.salario = salario;
		else this.salario = 0;
	}
	 
	 

}
