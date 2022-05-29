package meroHospital.Service;

import java.util.List;

import meroHospital.Model.LabReportModel;


public interface LabReportService {
	public void save(LabReportModel lapReportModel);
	public List<LabReportModel> display();
	public void delete(int id);
	public void edit(LabReportModel lapReportModel);
	public LabReportModel displayByid(int id);

}
