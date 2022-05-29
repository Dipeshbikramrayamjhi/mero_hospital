package meroHospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_equire")
public class EquireModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer eid;
private String name;
private String email;
private String subject;
private String message;


public EquireModel() {
	super();
}

public EquireModel(String name, String email, String subject, String message) {
	super();
	this.name = name;
	this.email = email;
	this.subject = subject;
	this.message = message;
}

public EquireModel(Integer eid, String name, String email, String subject, String message) {
	super();
	this.eid = eid;
	this.name = name;
	this.email = email;
	this.subject = subject;
	this.message = message;
}

public Integer getEid() {
	return eid;
}

public void setEid(Integer eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


}
