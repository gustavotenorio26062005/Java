package fronteira;

import entidade.Doador;

public class Empresa implements Doador{
	private Long id;
	private String cnpj;
	private String nome;
	private String fone;
		
	
	public Empresa(Long id, String cnpj, String nome, String fone) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.fone = fone;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public String getFone() {
		return fone;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

}
