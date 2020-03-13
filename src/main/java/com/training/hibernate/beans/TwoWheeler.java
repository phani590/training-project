package com.training.hibernate.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle{
	
	private String streeingHandle;

	/**
	 * @return the streeingHandle
	 */
	public String getStreeingHandle() {
		return streeingHandle;
	}

	/**
	 * @param streeingHandle the streeingHandle to set
	 */
	public void setStreeingHandle(String streeingHandle) {
		this.streeingHandle = streeingHandle;
	}	

}
