
public class Main {

	public static void main(String[] args) {
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Ze");
//		f1.setSalario(2000);
//		f1.setFone ("11999999999");
		
//		System.out.println("Funcionario");
//		System.out.println("Nome= " + f1.getNome() + " Salario= " + f1.getSalario()
//		+ " Bonus " + f1.bonus());
		
		Engenheiro e1 = new Engenheiro();
		e1.setNome("Ian");
		e1.setFone ( "11888888888");
		e1.setSalario(1000);
		//imprimirFuncionario(e1);
				
		Motorista m1 = new Motorista();
		m1.setNome("Paola");
		m1.setSalario(600);
		//imprimirFuncionario(m1);
		
		Gerente g1 = new Gerente();
		g1.setNome("Karl");
		g1.setSalario(5000);
		g1.pontos = 350;
		//imprimirFuncionario(g1);
		
		Analista a1 = new Analista("Java","Isa" , 12000);
		//imprimirFuncionario(a1);
		Presidente p1 = new Presidente();
		p1.setNome("Maria" );
		
		Cliente c1 = new Cliente();
		c1.setNome("Dom Pedro I");
		
		SysPedido ped = new SysPedido();
		ped.addPedido(g1);
		
		ped.addPedido(p1);
		
		ped.addPedido(c1);
		
	}

	private static void imprimirFuncionario(Funcionario func) {
		
		System.out.println("Nome= " + func.getNome() +
				" Salario= " + func.getSalario()
		+ " Bonus " + func.bonus());
	}

	

}
