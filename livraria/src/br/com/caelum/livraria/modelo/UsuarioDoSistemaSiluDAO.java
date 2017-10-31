package br.com.caelum.livraria.modelo;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.dao.JPAUtil;

public class UsuarioDoSistemaSiluDAO {

	public boolean existe(UsuarioDoSistemaSilu UsuarioDoSistemaSilu) {

		//BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		
		EntityManager em = new JPAUtil().getEntityManager();

		TypedQuery<UsuarioDoSistemaSilu> query = em.createQuery(
				"SELECT u FROM UsuarioDoSistemaSilu u WHERE u.login = :pLogin AND u.senha = :pSenha", UsuarioDoSistemaSilu.class);

		query.setParameter("pLogin", UsuarioDoSistemaSilu.getLogin());
		query.setParameter("pSenha", UsuarioDoSistemaSilu.getSenha());
		
		try {
			UsuarioDoSistemaSilu result = query.getSingleResult();			
		} catch (NoResultException nre) {
			return false;
		}
		
		em.close();
		
		return true;
			
		
//		//if (bcrypt.matches(senha, result.getSenha())) {
//		if(senha.equalsIgnoreCase(result.getSenha())){
//			return true;
//		}
//
//		em.close();
//
//		return false;
	}
	
	public UsuarioDoSistemaSilu buscaPorLogin(String login){
		EntityManager em = new JPAUtil().getEntityManager();

		TypedQuery<UsuarioDoSistemaSilu> query = em.createQuery(
				"select u from UsuarioDoSistemaSilu u where u.login = :pLogin", UsuarioDoSistemaSilu.class);

		query.setParameter("pLogin", login);
		
		UsuarioDoSistemaSilu result = null;
		
		try {
			result =  query.getSingleResult();			
		} catch (NoResultException nre) {
			return null;
		}
		
		em.close();
		
		return result;
	}
}
