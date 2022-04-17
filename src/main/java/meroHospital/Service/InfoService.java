package meroHospital.Service;

import java.util.List;

import meroHospital.Model.InfoModel;

public interface InfoService {
	
	public void save(InfoModel info);
	public List<InfoModel> display();
	public void delete(int id);
	public void edit(InfoModel info);
	public InfoModel displayByid();
	
}
