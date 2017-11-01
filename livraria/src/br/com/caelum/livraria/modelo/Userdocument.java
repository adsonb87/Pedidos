package br.com.caelum.livraria.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USERDOCUMENTS database table.
 * 
 */
@Entity
@Table(name="USERDOCUMENTS")
@NamedQuery(name="Userdocument.findAll", query="SELECT u FROM Userdocument u")
public class Userdocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserdocumentPK id;

	@Column(name="ST_CODE")
	private String stCode;

	@Column(name="USRDOC_CIRC")
	private String usrdocCirc;

	@Column(name="USRDOC_CITY")
	private String usrdocCity;

	@Column(name="USRDOC_COMPLEMENT")
	private String usrdocComplement;

	@Temporal(TemporalType.DATE)
	@Column(name="USRDOC_EMISSIONDATE")
	private Date usrdocEmissiondate;

	@Column(name="USRDOC_FOLHA")
	private String usrdocFolha;

	@Column(name="USRDOC_INSTITUTION")
	private String usrdocInstitution;

	@Column(name="USRDOC_LIVRO")
	private String usrdocLivro;

	@Column(name="USRDOC_NUMBER")
	private String usrdocNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="USRDOC_REGDATE")
	private Date usrdocRegdate;

	@Column(name="USRDOC_REGUSER")
	private String usrdocReguser;

	@Column(name="USRDOC_STATUS")
	private String usrdocStatus;

	@Column(name="USRDOC_SUBDISTRICT")
	private String usrdocSubdistrict;

	@Column(name="USRDOC_TERMO")
	private String usrdocTermo;

	public Userdocument() {
	}

	public UserdocumentPK getId() {
		return this.id;
	}

	public void setId(UserdocumentPK id) {
		this.id = id;
	}

	public String getStCode() {
		return this.stCode;
	}

	public void setStCode(String stCode) {
		this.stCode = stCode;
	}

	public String getUsrdocCirc() {
		return this.usrdocCirc;
	}

	public void setUsrdocCirc(String usrdocCirc) {
		this.usrdocCirc = usrdocCirc;
	}

	public String getUsrdocCity() {
		return this.usrdocCity;
	}

	public void setUsrdocCity(String usrdocCity) {
		this.usrdocCity = usrdocCity;
	}

	public String getUsrdocComplement() {
		return this.usrdocComplement;
	}

	public void setUsrdocComplement(String usrdocComplement) {
		this.usrdocComplement = usrdocComplement;
	}

	public Date getUsrdocEmissiondate() {
		return this.usrdocEmissiondate;
	}

	public void setUsrdocEmissiondate(Date usrdocEmissiondate) {
		this.usrdocEmissiondate = usrdocEmissiondate;
	}

	public String getUsrdocFolha() {
		return this.usrdocFolha;
	}

	public void setUsrdocFolha(String usrdocFolha) {
		this.usrdocFolha = usrdocFolha;
	}

	public String getUsrdocInstitution() {
		return this.usrdocInstitution;
	}

	public void setUsrdocInstitution(String usrdocInstitution) {
		this.usrdocInstitution = usrdocInstitution;
	}

	public String getUsrdocLivro() {
		return this.usrdocLivro;
	}

	public void setUsrdocLivro(String usrdocLivro) {
		this.usrdocLivro = usrdocLivro;
	}

	public String getUsrdocNumber() {
		return this.usrdocNumber;
	}

	public void setUsrdocNumber(String usrdocNumber) {
		this.usrdocNumber = usrdocNumber;
	}

	public Date getUsrdocRegdate() {
		return this.usrdocRegdate;
	}

	public void setUsrdocRegdate(Date usrdocRegdate) {
		this.usrdocRegdate = usrdocRegdate;
	}

	public String getUsrdocReguser() {
		return this.usrdocReguser;
	}

	public void setUsrdocReguser(String usrdocReguser) {
		this.usrdocReguser = usrdocReguser;
	}

	public String getUsrdocStatus() {
		return this.usrdocStatus;
	}

	public void setUsrdocStatus(String usrdocStatus) {
		this.usrdocStatus = usrdocStatus;
	}

	public String getUsrdocSubdistrict() {
		return this.usrdocSubdistrict;
	}

	public void setUsrdocSubdistrict(String usrdocSubdistrict) {
		this.usrdocSubdistrict = usrdocSubdistrict;
	}

	public String getUsrdocTermo() {
		return this.usrdocTermo;
	}

	public void setUsrdocTermo(String usrdocTermo) {
		this.usrdocTermo = usrdocTermo;
	}

	@Override
	public String toString() {
		return "Userdocument [id=" + id + ", stCode=" + stCode + ", usrdocCirc=" + usrdocCirc + ", usrdocCity="
				+ usrdocCity + ", usrdocComplement=" + usrdocComplement + ", usrdocEmissiondate=" + usrdocEmissiondate
				+ ", usrdocFolha=" + usrdocFolha + ", usrdocInstitution=" + usrdocInstitution + ", usrdocLivro="
				+ usrdocLivro + ", usrdocNumber=" + usrdocNumber + ", usrdocRegdate=" + usrdocRegdate
				+ ", usrdocReguser=" + usrdocReguser + ", usrdocStatus=" + usrdocStatus + ", usrdocSubdistrict="
				+ usrdocSubdistrict + ", usrdocTermo=" + usrdocTermo + "]\n";
	}

}