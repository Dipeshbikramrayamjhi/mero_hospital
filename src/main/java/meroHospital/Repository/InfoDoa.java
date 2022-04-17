package meroHospital.Repository;

import java.util.List;

import meroHospital.Model.InfoModel;

public interface InfoDoa {

	public void save(InfoModel info);
	public List<InfoModel> display();
	public void delete(int id);
	public void edit(InfoModel info);
	public InfoModel displayByid();
}
