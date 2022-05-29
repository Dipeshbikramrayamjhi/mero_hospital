package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.EquireModel;
import meroHospital.Repository.EquireDoa;
@Service
public class EquireServiceImpl implements  EquireService {

	@Autowired
	EquireDoa equireDoa;
	public void save(EquireModel equireModel) {
		equireDoa.save(equireModel);
		
	}

	public List<EquireModel> display() {
		// TODO Auto-generated method stub
		return equireDoa.display();
	}

	public void delete(int id) {
		equireDoa.delete(id);
		
	}

	public void edit(EquireModel equireModel) {
		equireDoa.edit(equireModel);
		
	}

	public EquireModel displayByid(int id) {
		// TODO Auto-generated method stub
		return equireDoa.displayByid(id);
	}

}
