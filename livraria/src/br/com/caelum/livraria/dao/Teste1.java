package br.com.caelum.livraria.dao;

import br.com.caelum.livraria.modelo.TipoDeUsuarioDoSistemaSilu;

public class Teste1 {

	public static void main(String[] args) {
		
		TipoDeUsuarioDoSistemaSilu tipo = new TipoDeUsuarioDoSistemaSilu();
		
		tipo.setDescricao("Descricao");
		tipo.setTipo("tipo");
		
		new DAO<TipoDeUsuarioDoSistemaSilu>(TipoDeUsuarioDoSistemaSilu.class).adiciona(tipo);
	}

}
