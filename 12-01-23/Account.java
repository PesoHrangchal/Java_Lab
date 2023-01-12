package com.BMS_Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bank_Accounts")
	public class Account {
	@Id
	private int account_No;
	@Column(length = 20 ,nullable =false)
	private String name;
	@Column(length=20 , nullable=false,unique=true)
	private long phone;
	@Column(length =20,nullable=false)
	private double balance;
	@Column (length=4,nullable=false)
	private int pin;
}
