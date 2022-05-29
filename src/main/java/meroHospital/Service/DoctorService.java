package meroHospital.Service;

import java.util.List;

import meroHospital.Model.DoctorModel;



public interface DoctorService {
	public void save(DoctorModel doctorModel);
	public List<DoctorModel> display();
	public void delete(int id);
	public void edit(DoctorModel doctorModel);
	public DoctorModel displayByid(int id);

}
