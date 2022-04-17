package meroHospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_department")
public class DepartmentModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer did ;
	private String departmentName ;
	private String relatedDisease ;
	private String aboutDepartment;
	
	public DepartmentModel()
	{
		
	}

	public DepartmentModel(String departmentName, String relatedDisease, String aboutDepartment) {
		super();
		this.departmentName = departmentName;
		this.relatedDisease = relatedDisease;
		this.aboutDepartment = aboutDepartment;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getRelatedDisease() {
		return relatedDisease;
	}

	public void setRelatedDisease(String relatedDisease) {
		this.relatedDisease = relatedDisease;
	}

	public String getAboutDepartment() {
		return aboutDepartment;
	}

	public void setAboutDepartment(String aboutDepartment) {
		this.aboutDepartment = aboutDepartment;
	}

	@Override
	public String toString() {
		return "DepartmentModel [did=" + did + ", departmentName=" + departmentName + ", relatedDisease="
				+ relatedDisease + ", aboutDepartment=" + aboutDepartment + "]";
	}

	
	

}
