package meroHospital.Repository;

import java.util.List;

import meroHospital.Model.LabReportModel;

public interface LabReportDoa {

	public void save(LabReportModel lapReportModel);
	public List<LabReportModel> display();
	public void delete(int id);
	public void edit(LabReportModel lapReportModel);
	public LabReportModel displayByid(int id);

}
