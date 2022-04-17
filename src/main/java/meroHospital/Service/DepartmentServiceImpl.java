package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.DepartmentModel;
import meroHospital.Repository.DepartmentDoa;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDoa departmentdoa ;
	
	public void save(DepartmentModel departmentModel) {
		
		departmentdoa.save(departmentModel);
		
	}

	public List<DepartmentModel> display() {
		// TODO Auto-generated method stub
		return departmentdoa.display();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void edit(DepartmentModel departmentModel) {
		// TODO Auto-generated method stub
		
	}

	public DepartmentModel displayByid() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
