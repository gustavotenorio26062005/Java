package fronteira;

import controle.ControleDoacao;
import entidade.Doacao;
import entidade.ItensDoacao;
import entidade.Usuario;

public class FronteiraDoacao {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1L, "Isa", "11999999999", "Rua Sobe de Desce, 99");
		Doacao doacao = new Doacao(null, null, null, usuario);
		
		ItensDoacao [] vetDoacao = new ItensDoacao [3]; 
		
		ControleDoacao controle = new ControleDoacao();
		controle.gravarDoacao(usuario, doacao, vetDoacao);
				
	}

}
