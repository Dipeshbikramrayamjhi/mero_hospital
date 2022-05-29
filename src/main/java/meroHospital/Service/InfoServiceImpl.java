package meroHospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meroHospital.Model.InfoModel;
import meroHospital.Repository.InfoDoa;
@Service
public class InfoServiceImpl implements InfoService{

	@Autowired 
	InfoDoa infodoa ;
	
	public void save(InfoModel info) {
		// TODO Auto-generated method stub
		//System.out.println(info.getName());
		infodoa.save(info);
		
	}

	public List<InfoModel> display() {
		// TODO Auto-generated method stub
		return infodoa.display();
	}

	public void delete(int id) {
		infodoa.delete(id);
		
	}

	public void edit(InfoModel info) {
		infodoa.edit(info);
		
	}

	public InfoModel displayByid(int id) {
		// TODO Auto-generated method stub
		return infodoa.displayByid(id);
	}

}
