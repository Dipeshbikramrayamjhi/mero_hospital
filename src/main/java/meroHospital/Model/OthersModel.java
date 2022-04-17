package meroHospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_others")
public class OthersModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 
	private Integer oid;
	private  String othersName;
	private String aboutCheckup ; 
	
	public OthersModel ()
	{
		
	}

	public OthersModel(String othersName, String aboutCheckup) {
		super();
		this.othersName = othersName;
		this.aboutCheckup = aboutCheckup;
	}

	public String getOthersName() {
		return othersName;
	}

	public void setOthersName(String othersName) {
		this.othersName = othersName;
	}

	public String getAboutCheckup() {
		return aboutCheckup;
	}

	public void setAboutCheckup(String aboutCheckup) {
		this.aboutCheckup = aboutCheckup;
	}

	@Override
	public String toString() {
		return "OthersModel [oid=" + oid + ", othersName=" + othersName + ", aboutCheckup=" + aboutCheckup + "]";
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}
	

}
