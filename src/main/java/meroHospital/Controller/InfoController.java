 package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import meroHospital.Model.InfoModel;
import meroHospital.Service.InfoService;


@Controller

public class InfoController {
	
	@Autowired
	InfoService infoservice ;
	
	@RequestMapping(value ="/admin/info_form", method = RequestMethod.GET)
	public String openInfoForm()
	{
		return "admin/info_form";
	}
	
	@RequestMapping(value ="/admin/info_form" ,method = RequestMethod.POST )
	public String infoSave(@RequestParam("name") String name,@RequestParam("address") String address
			, @RequestParam("contactNumber") long contactNumber ,@RequestParam("email")
			String email,@RequestParam("description") String description,@RequestParam("photo") String photo)
	{
//		System.out.println("name="+name+"address="+address+"contact="+contactNumber+"email="+"email="+email+"description="+description+"phto="+photo);
		
		InfoModel infomodel = new InfoModel(name,address,contactNumber,email,description,photo);
		infoservice.save(infomodel);
		return "redirect:/admin/info_form"; 
	}
	
	//Display of the hospital information
	@RequestMapping(value ="/admin/info_display", method = RequestMethod.GET)
	public String openInfoDisplay(Model model)
	{
		model.addAttribute("infolist", infoservice.display());
		return "admin/info_display";
	}
	
	//Delete 
	@RequestMapping(value ="/admin/info_display?delete", method = RequestMethod.GET)
	public String openInfoDelete(@RequestParam("delete") int iid)
	{
		System.out.println("hello");
		
		return "redirect:/admin/info_display";
	}
	@RequestMapping(value="/admin/info_update" , method = RequestMethod.GET)
	public String openInfoUpdate()
	{
		return "admin/info_update";
	}
	
	
	

}
