package br.com.caelum.livraria.teste;

import java.io.IOException;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.dao.JPAUtil;
import br.com.caelum.livraria.modelo.Userdocument;

public class Teste5 {
	public static void main(String[] args) throws IOException {		
		
		EntityManager em = new JPAUtil().getEntityManager();
				
//		StringBuilder sb = new StringBuilder();
//		sb.append(" SELECT DISTINCT ud"); 
//		sb.append(" FROM Userdocument ud ");
//		sb.append(" JOIN ud.Cardsxuser cxu");
//		sb.append(" WHERE ud.dtId = 6");
//		sb.append(" AND ud.usrdocNumber = :pCpf ");
//		sb.append("	AND cxu.cdId = :pTipo");
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT DISTINCT ud"); 
		sb.append(" FROM Userdocument ud ");
		sb.append("");
		sb.append(" WHERE ud.usrdocNumber = :pCpf ");
		sb.append(" AND DT_ID = :pDtid");
		
		TypedQuery<Userdocument> query = em.createQuery(sb.toString(), Userdocument.class);
		query.setParameter("pCpf", "71214408494");
		query.setParameter("pDtid", 6);

		
		List<Userdocument> r = query.getResultList();
		for(Userdocument u : r){
			System.out.println(u.toString());
		}
		
//		if(r.isEmpty()){
//			System.out.println("Não encontrado");
//		}else{
//			System.out.println("Encontrado");
//		}
		

		em.close();
	}	
}
