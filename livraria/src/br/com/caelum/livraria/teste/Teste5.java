package br.com.caelum.livraria.teste;

import java.io.IOException;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.type.descriptor.java.CalendarTypeDescriptor;

import br.com.caelum.livraria.dao.JPAUtil;
import br.com.caelum.livraria.modelo.Cardsxuser;
import br.com.caelum.livraria.modelo.Userdocument;

public class Teste5 {
	public static void main(String[] args) throws IOException {		
		
		EntityManager em = new JPAUtil().getEntityManager();
				
//		StringBuilder sb = new StringBuilder();
//		sb.append(" SELECT DISTINCT ud"); 
//		sb.append(" FROM Userdocument ud ");
//		sb.append(" JOIN ud.cardsxuserpk cxu");
//		sb.append(" WHERE DT_ID = 6");
		//sb.append(" AND ud.usrdocNumber = :pCpf");
		//sb.append("	AND cxu.CD_ID = :pTipo");
		
		
		StringBuilder sbUserdocument = new StringBuilder();
		sbUserdocument.append(" SELECT DISTINCT ud"); 
		sbUserdocument.append(" FROM Userdocument ud");
		sbUserdocument.append(" WHERE ud.usrdocNumber = :pCpf");
		sbUserdocument.append(" AND DT_ID = 6");
		
		StringBuilder sbCardsxusers = new StringBuilder();
		sbCardsxusers.append(" SELECT DISTINCT cxu"); 
		sbCardsxusers.append(" FROM Cardsxuser cxu");
		sbCardsxusers.append(" WHERE CD_ID = :pCdId");
		sbCardsxusers.append(" AND USR_ID = :pUsrId");
		
		TypedQuery<Userdocument> queryUserdocument = em.createQuery(sbUserdocument.toString(), Userdocument.class);
		queryUserdocument.setParameter("pCpf", "07114991444");
		
		List<Userdocument> r = queryUserdocument.getResultList();
		if(r.isEmpty()){
			System.out.println("não encontrado");
		}
		
		System.out.println(r.get(0).getId().getUsrId());
		
		TypedQuery<Cardsxuser> queryCardsxussers = em.createQuery(sbCardsxusers.toString(), Cardsxuser.class);
		queryCardsxussers.setParameter("pCdId", 19);
		queryCardsxussers.setParameter("pUsrId", r.get(0).getId().getUsrId());
		
		
		List<Cardsxuser> l = queryCardsxussers.getResultList();
		
		if(!l.isEmpty()){
			System.out.println(l.toString());
		}else{
			System.out.println("Não encontrado");
		}
		
//		if(!r2.equals(null)){
//			System.out.println(r2.toString());	
//		}
		
		
		
//		for(Userdocument u : r){
//			System.out.println(u.getId());
//		}

		em.close();
	}	
}
