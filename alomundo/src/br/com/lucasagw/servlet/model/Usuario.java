package br.com.lucasagw.servlet.model;

public class Usuario {
	private String login;
	private String senha;
	private String email;
    private PapelEnum papel;

	
    
    public Usuario() {
		super();
	}

	public Usuario(String login, String senha, PapelEnum papel) {
		super();
		this.login = login;
		this.senha = senha;
		this.papel = papel;
		this.email="";
	}

	public Usuario(String login, String senha) {	
		this(login, senha, PapelEnum.USUARIO);
	
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public PapelEnum getPapel() {
		return papel;
	}

	public void setPapel(PapelEnum papel) {
		this.papel = papel;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;  //se login e senha forem iguais, ele retorna true.
	}
}
