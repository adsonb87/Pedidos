package br.com.caelum.livraria.teste;

import br.com.caelum.livraria.bean.LoginBean;
import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSilu;

public class Teste1 {

	public static void main(String[] args) {
		
		UsuarioDoSistemaSilu user = new DAO<UsuarioDoSistemaSilu>(UsuarioDoSistemaSilu.class).buscaPorId(1);
		
		LoginBean l = new LoginBean();
		
		l.setUsuarioDoSistemaSilu(user);
		l.setSenha("senha");
		
		System.out.println(l.efetuarLogin());
		
	}

}
