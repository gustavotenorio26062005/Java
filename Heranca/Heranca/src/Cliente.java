
public class Cliente implements Autenticado{
	private String nome;
	private String usuario;
	private String senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String login(String usuario, String senha) {
		return "Ok";
	}
	@Override
	public String logff() {
		return "desconectado";
	}

}
