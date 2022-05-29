package meroHospital.Repository;

import java.util.List;

import meroHospital.Model.EquireModel;

public interface EquireDoa {
	public void save(EquireModel equireModel);
	public List<EquireModel> display();
	public void delete(int id);
	public void edit(EquireModel equireModel);
	public EquireModel displayByid(int id);
}
