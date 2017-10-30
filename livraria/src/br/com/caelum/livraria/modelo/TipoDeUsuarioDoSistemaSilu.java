package br.com.caelum.livraria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SILU_TIPO_USUARIO_SISTEMA")
//@SequenceGenerator(name="id_seq_tipo_usuario", sequenceName="tipo_usu_seq", initialValue=1, allocationSize=1)
public class TipoDeUsuarioDoSistemaSilu {

	@Id
	@Column(name = "ID")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_seq_tipo_usuario")
	private Integer id;

	private String tipo;
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
