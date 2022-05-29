  package meroHospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_doctor")
public class DoctorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer did;
	private String doctorName;
	private String doctorPhoto;
	private String graduation;
	private String specialist;
	@ManyToOne
	@JoinColumn(name="dpt_id" )
	private DepartmentModel department;
	private String workExperience;
	private String awardInfo;
	
	public DoctorModel() {
		
	}

	

	


	public DoctorModel(Integer did, String doctorName, String doctorPhoto, String graduation, String specialist,
			DepartmentModel department, String workExperience, String awardInfo) {
		super();
		this.did = did;
		this.doctorName = doctorName;
		this.doctorPhoto = doctorPhoto;
		this.graduation = graduation;
		this.specialist = specialist;
		this.department = department;
		this.workExperience = workExperience;
		this.awardInfo = awardInfo;
	}






	public DoctorModel(Integer did, String doctorName, String doctorPhoto, String graduation, String specialist,
			 String workExperience, String awardInfo) {
		super();
		this.did = did;
		this.doctorName = doctorName;
		this.doctorPhoto = doctorPhoto;
		this.graduation = graduation;
		this.specialist = specialist;
		
		this.workExperience = workExperience;
		this.awardInfo = awardInfo;
	}



	public DoctorModel(String doctorName, String doctorPhoto, String graduation, String specialist,
			String workExperience, String awardInfo) {
		super();
		this.doctorName = doctorName;
		this.doctorPhoto = doctorPhoto;
		this.graduation = graduation;
		this.specialist = specialist;
		this.workExperience = workExperience;
		this.awardInfo = awardInfo;
	}



	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorPhoto() {
		return doctorPhoto;
	}

	public void setDoctorPhoto(String doctorPhoto) {
		this.doctorPhoto = doctorPhoto;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	

	public DepartmentModel getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getAwardInfo() {
		return awardInfo;
	}

	public void setAwardInfo(String awardInfo) {
		this.awardInfo = awardInfo;
	}

	@Override
	public String toString() {
		return "DoctorModel [did=" + did + ", doctorName=" + doctorName + ", doctorPhoto=" + doctorPhoto
				+ ", graduation=" + graduation + ", specialist=" + specialist + ", department=" + department
				+ ", workExperience=" + workExperience + ", awardInfo=" + awardInfo + "]";
	}
	
	

}
