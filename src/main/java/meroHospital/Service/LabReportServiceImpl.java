package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.LabReportModel;
import meroHospital.Repository.LabReportDoa;

@Service
public class LabReportServiceImpl implements LabReportService  {

	@Autowired
	LabReportDoa labReportDoa;
	public void save(LabReportModel lapReportModel) {
		
		labReportDoa.save(lapReportModel);
	}

	public List<LabReportModel> display() {
		// TODO Auto-generated method stub
		return labReportDoa.display() ;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		labReportDoa.delete(id);
	}

	public void edit(LabReportModel lapReportModel) {
		// TODO Auto-generated method stub
		labReportDoa.edit(lapReportModel);
	}

	public LabReportModel displayByid(int id) {
		// TODO Auto-generated method stub
		return labReportDoa.displayByid(id);
	}

}
