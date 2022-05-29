package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.OthersModel;
import meroHospital.Repository.OthersDoa;

@Service
public class OthersServiceImpl implements OthersService {

	@Autowired
	OthersDoa othersdoa;
	
	public void save(OthersModel othersmodel) {
		// TODO Auto-generated method stub
		 othersdoa.save(othersmodel);;
	}

	public List<OthersModel> display() {
		// TODO Auto-generated method stub
		return othersdoa.display();
	}

	public void delete(int id) {
		othersdoa.delete(id);
		
	}

	public void edit(OthersModel othersmodel) {
		othersdoa.edit(othersmodel);
		
	}

	public OthersModel displayByid(int id) {
		// TODO Auto-generated method stub
		return othersdoa.displayByid(id);
	}
	

}
