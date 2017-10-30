package br.com.caelum.livraria.teste;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSilu;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSiluDAO;

public class Teste1 {

	public static void main(String[] args) {
		
		new DAO<UsuarioDoSistemaSilu>(UsuarioDoSistemaSilu.class).buscaPorId(1);
		
		UsuarioDoSistemaSiluDAO d = new UsuarioDoSistemaSiluDAO();
		
		System.out.println(d.existe(new DAO<UsuarioDoSistemaSilu>(UsuarioDoSistemaSilu.class).buscaPorId(1), "555"));
	}

}
