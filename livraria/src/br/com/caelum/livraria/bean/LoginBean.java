package br.com.caelum.livraria.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.modelo.UsuarioDoSistemaSilu;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSiluDAO;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
	
	private UsuarioDoSistemaSilu user = new UsuarioDoSistemaSilu();
	private String senha;

	public UsuarioDoSistemaSilu getUser() {
		return user;
	}

	public void setUsuarioDoSistemaSilu(UsuarioDoSistemaSilu UsuarioDoSistemaSilu) {
		this.user = UsuarioDoSistemaSilu;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String efetuarLogin() { 

		boolean existe = new UsuarioDoSistemaSiluDAO().existe(this.user, senha);

		FacesContext contexto = FacesContext.getCurrentInstance();

		if (existe) {
			this.user = new UsuarioDoSistemaSiluDAO().buscaPorLogin(this.user.getLogin());
			contexto.getExternalContext().getSessionMap().put("UsuarioDoSistemaSilulogado", this.user);
			return "userSilu?faces-redirect-true";
		} else {
			contexto.getExternalContext().getFlash().setKeepMessages(true);
			contexto.addMessage(null, new FacesMessage("Usu�rio e/ou senha inv�lido."));
			return "login?faces-redirect=true";
		}

	}

	public String deslogar() {
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.getExternalContext().getSessionMap().remove("UsuarioDoSistemaSilulogado");
		return "login?faces-redirect=true";
	}
}
