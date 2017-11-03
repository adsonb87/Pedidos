package br.com.caelum.livraria.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.dao.JPAUtil;

public class ValidaCpfNaBase {
	public boolean validaCpfNaBase(String cpf, Integer cardId){
			
			EntityManager em = new JPAUtil().getEntityManager();
			
			StringBuilder sbUserdocument = new StringBuilder();
			sbUserdocument.append(" SELECT DISTINCT ud"); 
			sbUserdocument.append(" FROM Userdocument ud");
			sbUserdocument.append(" WHERE ud.usrdocNumber = :pCpf");
			sbUserdocument.append(" AND DT_ID = 6"); //Tipo de documento 6 = cpf	
			
			StringBuilder sbCardsxusers = new StringBuilder();
			sbCardsxusers.append(" SELECT DISTINCT cxu"); 
			sbCardsxusers.append(" FROM Cardsxuser cxu");
			sbCardsxusers.append(" WHERE CD_ID = :pCdId");
			sbCardsxusers.append(" AND USR_ID = :pUsrId");
			
			TypedQuery<Userdocument> queryUserdocument = em.createQuery(sbUserdocument.toString(), Userdocument.class);
			queryUserdocument.setParameter("pCpf", cpf);
			
			Userdocument ud = queryUserdocument.getSingleResult();
			
			TypedQuery<Cardsxuser> queryCardsxussers = em.createQuery(sbCardsxusers.toString(), Cardsxuser.class);
			queryCardsxussers.setParameter("pCdId", cardId);
			queryCardsxussers.setParameter("pUsrId", ud.getId().getUsrId());
			
			List<Cardsxuser> lista = queryCardsxussers.getResultList();
			
			em.close();
			
			if(!lista.isEmpty()){
				return true;
			}else{
				return false;
			}
			
		}
}
