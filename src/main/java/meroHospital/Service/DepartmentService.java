package meroHospital.Service;

import java.util.List;

import meroHospital.Model.DepartmentModel;



public interface DepartmentService {

	public void save(DepartmentModel departmentModel);
	public List<DepartmentModel> display();
	public void delete(int id);
	public void edit(DepartmentModel departmentModel);
	public DepartmentModel displayByid(int id);
}
