package com.example.fserv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idperson;
	
	@Column(name = "fname")
   private String fname;
	
	@Column(name = "lname")
   private String lname;
   
   protected person() {
	   
   }

protected person(int idperson, String fname, String lname) {
	super();
	this.idperson = idperson;
	this.fname = fname;
	this.lname = lname;
}

public int getIdperson() {
	return idperson;
}

public void setIdperson(int idperson) {
	this.idperson = idperson;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

@Override
public String toString() {
	return "person [idperson=" + idperson + ", fname=" + fname + ", lname=" + lname + "]";
}
   
  
   
}
