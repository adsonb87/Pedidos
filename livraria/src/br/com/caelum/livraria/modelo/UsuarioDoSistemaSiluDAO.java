package br.com.caelum.livraria.modelo;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.dao.JPAUtil;

public class UsuarioDoSistemaSiluDAO {

	public boolean existe(UsuarioDoSistemaSilu UsuarioDoSistemaSilu, String senha) {

		//BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		
		EntityManager em = new JPAUtil().getEntityManager();

		TypedQuery<UsuarioDoSistemaSilu> query = em.createQuery(
				"select u from UsuarioDoSistemaSilu u where u.login = :pLogin", UsuarioDoSistemaSilu.class);

		query.setParameter("pLogin", UsuarioDoSistemaSilu.getLogin());

		UsuarioDoSistemaSilu result = query.getSingleResult();
		
		System.out.println(result.getSenha());
		
		//if (bcrypt.matches(senha, result.getSenha())) {
		if(senha.equalsIgnoreCase(result.getSenha())){
			return true;
		}

		em.close();

		return false;
	}
	
	public UsuarioDoSistemaSilu buscaPorLogin(String login){
		EntityManager em = new JPAUtil().getEntityManager();

		TypedQuery<UsuarioDoSistemaSilu> query = em.createQuery(
				"select u from UsuarioDoSistemaSilu u where u.login = :pLogin", UsuarioDoSistemaSilu.class);

		query.setParameter("pLogin", login);

		UsuarioDoSistemaSilu result =  query.getSingleResult();
		
		em.close();
		if(result == null){
			return null;
		} else{
			return result;
		}
	}
}
