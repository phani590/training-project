package com.training.hibernate.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle{

		private String SteeringCar;

		/**
		 * @return the steeringCar
		 */
		public String getSteeringCar() {
			return SteeringCar;
		}

		/**
		 * @param steeringCar the steeringCar to set
		 */
		public void setSteeringCar(String steeringCar) {
			SteeringCar = steeringCar;
		}
		
}
