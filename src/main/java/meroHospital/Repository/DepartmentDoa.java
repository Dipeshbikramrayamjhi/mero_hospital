package meroHospital.Repository;

import java.util.List;

import meroHospital.Model.DepartmentModel;

public interface DepartmentDoa {
	public void save(DepartmentModel departmentModel);
	public List<DepartmentModel> display();
	public void delete(int id);
	public void edit(DepartmentModel departmentModel);
	public DepartmentModel displayByid();

}
