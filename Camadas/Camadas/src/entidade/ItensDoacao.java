package entidade;

public class ItensDoacao {
	
	private Long id;
	private String descricao;
	private int quantidade;
	private Doacao doacao;
	
	public ItensDoacao(String descricao, int quantidade,
			Doacao doacao) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.doacao = doacao;
	}
	
	
	public Doacao getDoacao() {
		return doacao;
	}


	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}


	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
