
public class Gerente extends Autenticavel{
	int pontos;
	public double bonus () {
		return super.getSalario() * 1.5 + this.pontos*100;
	}

}
