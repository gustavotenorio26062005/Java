
public class Engenheiro extends Funcionario{
	int crea;
	
	public double bonus () {
		return super.getSalario() * 2;
	}

}
