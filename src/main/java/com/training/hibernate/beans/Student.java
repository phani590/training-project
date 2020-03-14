package com.training.hibernate.beans;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	private long studentId;
	private String studentName;
	private Address studentAddress;
	
//	 @Embedded
//	    @AttributeOverrides(value = {
//	        @AttributeOverride(name = "street", column = @Column(name = "house_street")),
//	        @AttributeOverride(name = "city", column = @Column(name = "house_city")),
//	        @AttributeOverride(name = "state", column = @Column(name = "house_state")),
//	        @AttributeOverride(name = "pinCode", column = @Column(name = "house_pinCode"))
//	    })
//	    private Address houseAddress;

	public Student() {
	}

	public Student(String studentName, Address studentAddress) {
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Embedded
	public Address getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

//	public Address getHouseAddress() {
//		return houseAddress;
//	}
//
//	public void setHouseAddress(Address houseAddress) {
//		this.houseAddress = houseAddress;
//	}
	

}
