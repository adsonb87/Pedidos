package br.com.caelum.livraria.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CARDSXUSERS database table.
 * 
 */
@Embeddable
public class CardsxuserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ISS_ID", insertable=false, updatable=false)
	private long issId;

	@Column(name="CD_ID", insertable=false, updatable=false)
	private long cdId;

	@Column(name="CRD_SNR", insertable=false, updatable=false)
	private long crdSnr;

	@Column(name="CI_ID", insertable=false, updatable=false)
	private long ciId;

	@Column(name="USR_ID", insertable=false, updatable=false)
	private long usrId;

	public CardsxuserPK() {
	}
	public long getIssId() {
		return this.issId;
	}
	public void setIssId(long issId) {
		this.issId = issId;
	}
	public long getCdId() {
		return this.cdId;
	}
	public void setCdId(long cdId) {
		this.cdId = cdId;
	}
	public long getCrdSnr() {
		return this.crdSnr;
	}
	public void setCrdSnr(long crdSnr) {
		this.crdSnr = crdSnr;
	}
	public long getCiId() {
		return this.ciId;
	}
	public void setCiId(long ciId) {
		this.ciId = ciId;
	}
	public long getUsrId() {
		return this.usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CardsxuserPK)) {
			return false;
		}
		CardsxuserPK castOther = (CardsxuserPK)other;
		return 
			(this.issId == castOther.issId)
			&& (this.cdId == castOther.cdId)
			&& (this.crdSnr == castOther.crdSnr)
			&& (this.ciId == castOther.ciId)
			&& (this.usrId == castOther.usrId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.issId ^ (this.issId >>> 32)));
		hash = hash * prime + ((int) (this.cdId ^ (this.cdId >>> 32)));
		hash = hash * prime + ((int) (this.crdSnr ^ (this.crdSnr >>> 32)));
		hash = hash * prime + ((int) (this.ciId ^ (this.ciId >>> 32)));
		hash = hash * prime + ((int) (this.usrId ^ (this.usrId >>> 32)));
		
		return hash;
	}
	@Override
	public String toString() {
		return "CardsxuserPK [issId=" + issId + ", cdId=" + cdId + ", crdSnr=" + crdSnr + ", ciId=" + ciId + ", usrId="
				+ usrId + "]";
	}
}