package com.test.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String emailAddress;
	private String name;
	private String purchasedPackage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurchasedPackage() {
		return purchasedPackage;
	}

	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}

	public Student(Long id, String emailAddress, String name, String purchasedPackage) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.name = name;
		this.purchasedPackage = purchasedPackage;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", emailAddress=" + emailAddress + ", name=" + name + ", purchasedPackage="
				+ purchasedPackage + "]";
	}

}
