package br.com.caelum.livraria.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CARDSXUSERS database table.
 * 
 */
@Entity
@Table(name="CARDSXUSERS")
@NamedQuery(name="Cardsxuser.findAll", query="SELECT c FROM Cardsxuser c")
public class Cardsxuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CardsxuserPK id;

	@Column(name="CRDUSR_BOXNAME")
	private String crdusrBoxname;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_DATEDELIVERY")
	private Date crdusrDatedelivery;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_DATEPRINT")
	private Date crdusrDateprint;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_DATEQUEUE")
	private Date crdusrDatequeue;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_DATERECORD")
	private Date crdusrDaterecord;

	@Lob
	@Column(name="CRDUSR_DIGITALSIGN")
	private byte[] crdusrDigitalsign;

	@Column(name="CRDUSR_JOBNBR")
	private BigDecimal crdusrJobnbr;

	@Column(name="CRDUSR_PRNSTATUS")
	private String crdusrPrnstatus;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_RECEIVERDATE")
	private Date crdusrReceiverdate;

	@Column(name="CRDUSR_RECEIVERIDNBR")
	private String crdusrReceiveridnbr;

	@Column(name="CRDUSR_RECEIVERNAME")
	private String crdusrReceivername;

	@Temporal(TemporalType.DATE)
	@Column(name="CRDUSR_REGDATE")
	private Date crdusrRegdate;

	@Column(name="CRDUSR_REGUSER")
	private String crdusrReguser;

	@Column(name="CRDUSR_STATUS")
	private String crdusrStatus;

	@Column(name="CRDUSR_USERDELIVERY")
	private String crdusrUserdelivery;

	@Column(name="PRA_ID")
	private BigDecimal praId;

	public Cardsxuser() {
	}

	public CardsxuserPK getId() {
		return this.id;
	}

	public void setId(CardsxuserPK id) {
		this.id = id;
	}

	public String getCrdusrBoxname() {
		return this.crdusrBoxname;
	}

	public void setCrdusrBoxname(String crdusrBoxname) {
		this.crdusrBoxname = crdusrBoxname;
	}

	public Date getCrdusrDatedelivery() {
		return this.crdusrDatedelivery;
	}

	public void setCrdusrDatedelivery(Date crdusrDatedelivery) {
		this.crdusrDatedelivery = crdusrDatedelivery;
	}

	public Date getCrdusrDateprint() {
		return this.crdusrDateprint;
	}

	public void setCrdusrDateprint(Date crdusrDateprint) {
		this.crdusrDateprint = crdusrDateprint;
	}

	public Date getCrdusrDatequeue() {
		return this.crdusrDatequeue;
	}

	public void setCrdusrDatequeue(Date crdusrDatequeue) {
		this.crdusrDatequeue = crdusrDatequeue;
	}

	public Date getCrdusrDaterecord() {
		return this.crdusrDaterecord;
	}

	public void setCrdusrDaterecord(Date crdusrDaterecord) {
		this.crdusrDaterecord = crdusrDaterecord;
	}

	public byte[] getCrdusrDigitalsign() {
		return this.crdusrDigitalsign;
	}

	public void setCrdusrDigitalsign(byte[] crdusrDigitalsign) {
		this.crdusrDigitalsign = crdusrDigitalsign;
	}

	public BigDecimal getCrdusrJobnbr() {
		return this.crdusrJobnbr;
	}

	public void setCrdusrJobnbr(BigDecimal crdusrJobnbr) {
		this.crdusrJobnbr = crdusrJobnbr;
	}

	public String getCrdusrPrnstatus() {
		return this.crdusrPrnstatus;
	}

	public void setCrdusrPrnstatus(String crdusrPrnstatus) {
		this.crdusrPrnstatus = crdusrPrnstatus;
	}

	public Date getCrdusrReceiverdate() {
		return this.crdusrReceiverdate;
	}

	public void setCrdusrReceiverdate(Date crdusrReceiverdate) {
		this.crdusrReceiverdate = crdusrReceiverdate;
	}

	public String getCrdusrReceiveridnbr() {
		return this.crdusrReceiveridnbr;
	}

	public void setCrdusrReceiveridnbr(String crdusrReceiveridnbr) {
		this.crdusrReceiveridnbr = crdusrReceiveridnbr;
	}

	public String getCrdusrReceivername() {
		return this.crdusrReceivername;
	}

	public void setCrdusrReceivername(String crdusrReceivername) {
		this.crdusrReceivername = crdusrReceivername;
	}

	public Date getCrdusrRegdate() {
		return this.crdusrRegdate;
	}

	public void setCrdusrRegdate(Date crdusrRegdate) {
		this.crdusrRegdate = crdusrRegdate;
	}

	public String getCrdusrReguser() {
		return this.crdusrReguser;
	}

	public void setCrdusrReguser(String crdusrReguser) {
		this.crdusrReguser = crdusrReguser;
	}

	public String getCrdusrStatus() {
		return this.crdusrStatus;
	}

	public void setCrdusrStatus(String crdusrStatus) {
		this.crdusrStatus = crdusrStatus;
	}

	public String getCrdusrUserdelivery() {
		return this.crdusrUserdelivery;
	}

	public void setCrdusrUserdelivery(String crdusrUserdelivery) {
		this.crdusrUserdelivery = crdusrUserdelivery;
	}

	public BigDecimal getPraId() {
		return this.praId;
	}

	public void setPraId(BigDecimal praId) {
		this.praId = praId;
	}

}