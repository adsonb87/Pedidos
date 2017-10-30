package br.com.caelum.livraria.teste;

import java.util.Calendar;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.TipoDeUsuarioDoSistemaSilu;
import br.com.caelum.livraria.modelo.UsuarioDoSistemaSilu;
import oracle.sql.DATE;

public class Teste1 {

	public static void main(String[] args) {
		
		UsuarioDoSistemaSilu usu = new UsuarioDoSistemaSilu();
		
		usu.setEmail("email");
		usu.setId(1);
		usu.setLogin("login");
		usu.setNome("nome");
		usu.setSenha("senha");
		usu.setTipo(new DAO<TipoDeUsuarioDoSistemaSilu>(TipoDeUsuarioDoSistemaSilu.class).buscaPorId(1));
		usu.setUltimaAlteracao(Calendar.getInstance());
		
		new DAO<UsuarioDoSistemaSilu>(UsuarioDoSistemaSilu.class).adiciona(usu);
	}

}
