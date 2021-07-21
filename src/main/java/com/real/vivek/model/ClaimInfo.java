package com.real.vivek.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClaimInfo {

	@Id
	public Integer claimId;
	public Integer claimNumber;
	public String claimType;

	public Integer getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(Integer claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(claimId, claimNumber, claimType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaimInfo other = (ClaimInfo) obj;
		return Objects.equals(claimId, other.claimId) && Objects.equals(claimNumber, other.claimNumber)
				&& Objects.equals(claimType, other.claimType);
	}

	@Override
	public String toString() {
		return "ClaimInfo [claimId=" + claimId + ", claimNumber=" + claimNumber + ", claimType=" + claimType + "]";
	}

}
