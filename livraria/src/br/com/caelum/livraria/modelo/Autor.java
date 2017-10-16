package br.com.caelum.livraria.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AL_AUTOR")
@SequenceGenerator(name="id_seq_aut", sequenceName="aut_seq", initialValue = 1, allocationSize = 1)
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_seq_aut")
	private Integer id;
	
	private String nome;
	//private String email;
	

	
	
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
