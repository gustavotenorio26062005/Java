
public abstract class Autenticavel extends Funcionario implements Autenticado {
	private String usuario;
	private  String senha;
	
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
	public String login (String usuario, String senha) {
		return "ok";
	}
	public String logff () {
		return "desconectado";
	}
	
}
