package entidade;

public class Usuario implements Doador{
	
	private Long id; 
	private String nome;
	private String fone;
	private String endereco;
	
	public Usuario(Long id, String nome, String fone, String endereco) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getFone() {
		return fone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
