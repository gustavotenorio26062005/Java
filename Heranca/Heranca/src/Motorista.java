
public class Motorista extends Funcionario{
	
	int cnh;
	public double bonus () {
		return super.getSalario() * 1.3;
	}

}
