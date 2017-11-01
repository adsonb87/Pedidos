package br.com.caelum.livraria.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USERDOCUMENTS database table.
 * 
 */
@Embeddable
public class UserdocumentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DT_ID", insertable=false, updatable=false)
	private long dtId;

	@Column(name="USR_ID", insertable=false, updatable=false)
	private long usrId;

	@Column(name="USRDOC_SEQNBR")
	private long usrdocSeqnbr;

	public UserdocumentPK() {
	}
	public long getDtId() {
		return this.dtId;
	}
	public void setDtId(long dtId) {
		this.dtId = dtId;
	}
	public long getUsrId() {
		return this.usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}
	public long getUsrdocSeqnbr() {
		return this.usrdocSeqnbr;
	}
	public void setUsrdocSeqnbr(long usrdocSeqnbr) {
		this.usrdocSeqnbr = usrdocSeqnbr;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserdocumentPK)) {
			return false;
		}
		UserdocumentPK castOther = (UserdocumentPK)other;
		return 
			(this.dtId == castOther.dtId)
			&& (this.usrId == castOther.usrId)
			&& (this.usrdocSeqnbr == castOther.usrdocSeqnbr);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.dtId ^ (this.dtId >>> 32)));
		hash = hash * prime + ((int) (this.usrId ^ (this.usrId >>> 32)));
		hash = hash * prime + ((int) (this.usrdocSeqnbr ^ (this.usrdocSeqnbr >>> 32)));
		
		return hash;
	}
	@Override
	public String toString() {
		return "UserdocumentPK [dtId=" + dtId + ", usrId=" + usrId + ", usrdocSeqnbr=" + usrdocSeqnbr + "]";
	}
}