package meroHospital.Repository;

import java.util.List;

import meroHospital.Model.OthersModel;

public interface OthersDoa {
	public void save(OthersModel othersmodel);
	public List<OthersModel> display();
	public void delete(int id);
	public void edit(OthersModel othersmodel);
	public OthersModel displayByid();

}