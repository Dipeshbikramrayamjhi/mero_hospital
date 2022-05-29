package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.DoctorModel;
import meroHospital.Repository.DoctorDoa;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDoa doctorDoa;
	
	public void save(DoctorModel doctorModel) {
		doctorDoa.save(doctorModel);
		
	}

	public List<DoctorModel> display() {
		// TODO Auto-generated method stub
		return doctorDoa.display();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		doctorDoa.delete(id);
		
	}

	public void edit(DoctorModel doctorModel) {
		doctorDoa.edit(doctorModel);
		
	}

	public DoctorModel displayByid(int id) {
		// TODO Auto-generated method stub
		return doctorDoa.displayByid(id);
	}

}
