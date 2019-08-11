package com.parking.lot.accounts;

import com.parking.lot.constants.AccountStatus;
import com.parking.lot.domain.Person;

public abstract class Account {
	private String userName;
	private String password;
	private AccountStatus status;
	private Person person;

	public boolean resetPassword(String password) {
		this.password = password;
		return true;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getPassword() {
		return password;
	}
	
	
}
