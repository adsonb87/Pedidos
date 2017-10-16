package br.com.caelum.livraria.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AL_USUARIO")
@SequenceGenerator(name="id_seq_usu", sequenceName="usu_seq", initialValue = 1, allocationSize = 1)
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_seq_usu")
	private Integer id;
	
	private String senha;
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
