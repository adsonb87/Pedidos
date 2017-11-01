package br.com.caelum.livraria.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.modelo.UsuarioDoSistemaSilu;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSiluDAO;
import br.com.caelum.livraria.util.RedirectView;

@ManagedBean
@SessionScoped
public class LoginBean{
	
	private UsuarioDoSistemaSilu user = new UsuarioDoSistemaSilu();

	public UsuarioDoSistemaSilu getUser() {
		return user;
	}

	public void setUsuarioDoSistemaSilu(UsuarioDoSistemaSilu UsuarioDoSistemaSilu) {
		this.user = UsuarioDoSistemaSilu;
	}


	public RedirectView efetuarLogin() { 
		
		System.out.println(user.getLogin() + " " + user.getSenha());
		
		FacesContext contexto = FacesContext.getCurrentInstance();
		
		boolean existe = new UsuarioDoSistemaSiluDAO().existe(this.user);

		if (existe) {
			contexto.getExternalContext().getSessionMap().put("usuarioLogado", this.user);
			return new RedirectView("carregarPedido");
		}
			
		contexto.getExternalContext().getFlash().setKeepMessages(true);
		contexto.addMessage(null, new FacesMessage("Usuário e/ou senha inválido."));
		return new RedirectView("login");

	}

	public RedirectView deslogar() {
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.getExternalContext().getSessionMap().remove("UsuarioDoSistemaSilulogado");
		return new RedirectView("login");
	}
}
