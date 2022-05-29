package meroHospital.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_labreport")
public class LabReportModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer lid;
	private String billNumber ;
	private String patientName;
	private String lapReport;
	
	public LabReportModel() {
		super();
	}

	public LabReportModel(Integer lid, String billNumber, String patientName, String lapReport) {
		super();
		this.lid = lid;
		this.billNumber = billNumber;
		this.patientName = patientName;
		this.lapReport = lapReport;
	}

	public LabReportModel(String billNumber, String patientName,String lapReport) {
		super();
		this.billNumber = billNumber;
		this.patientName = patientName;
		this.lapReport = lapReport;
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getLapReport() {
		return lapReport;
	}

	public void setLapReport(String lapReport) {
		this.lapReport = lapReport;
	}
	
	
	
}
