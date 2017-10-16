package br.com.caelum.livraria.dao;

import javax.persistence.EntityManager;

import com.sun.xml.internal.stream.Entity;

import br.com.caelum.livraria.bean.LoginBean;
import br.com.caelum.livraria.modelo.Usuario;

public class CadastraUsuario {
	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		
		user.setEmail("andre@gmail.com");
		user.setSenha("12345");
	
		LoginBean l = new LoginBean();
		
	System.out.println(l.efetuarLogin());
		
		
	}
}
