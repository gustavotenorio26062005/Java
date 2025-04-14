package entidade;

public class Doacao {
	
	private Long id;
	private String dataDoacao;
	private String dataRetirada;
	private String horaRetirada;
	private Doador doador;
	
	public Doacao(String dataDoacao, String dataRetirada, 
			String horaRetirada, Doador doador ) {
		this.dataDoacao = dataDoacao;
		this.dataRetirada = dataRetirada;
		this.horaRetirada = horaRetirada;
		this.doador = doador;
	}
	
	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataDoacao() {
		return dataDoacao;
	}
	
	public String getDataRetirada() {
		return dataRetirada;
	}
	public String getHoraRetirada() {
		return horaRetirada;
	}
	public void setDataDoacao(String dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public void setHoraRetirada(String horaRetirada) {
		this.horaRetirada = horaRetirada;
	}
	
	

}
