 package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import meroHospital.Model.InfoModel;
import meroHospital.Service.FileUploadService;
import meroHospital.Service.InfoService;


@Controller

public class InfoController {
	
	@Autowired
	InfoService infoservice ;
	@Autowired
	FileUploadService fuService ; 
	
	@RequestMapping(value ="/admin/info_form", method = RequestMethod.GET)
	public String openInfoForm()
	{
		return "admin/info_form";
	}
	
	@RequestMapping(value ="/admin/info_form" ,method = RequestMethod.POST )
	public String infoSave(@RequestParam("name") String name,@RequestParam("address") String address
			, @RequestParam("contactNumber") long contactNumber ,@RequestParam("email")
			String email,@RequestParam("description") String description,@RequestParam("photo") MultipartFile photo)
	{
//		System.out.println("name="+name+"address="+address+"contact="+contactNumber+"email="+"email="+email+"description="+description+"phto="+photo);
		
		InfoModel infomodel = new InfoModel(name,address,contactNumber,email,description,photo.getOriginalFilename());
		infoservice.save(infomodel);
		fuService.uploadImage(photo, "hospital");
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
	@RequestMapping(value ="/admin/info_delete/{id}", method = RequestMethod.GET)
	public String openInfoDelete(@PathVariable("id") int iid)
	{
		
		infoservice.delete(iid);
		return "redirect:/admin/info_display";
	}
	@RequestMapping(value="/admin/info_update/{id}" , method = RequestMethod.GET)
	public String openInfoUpdate(@PathVariable("id")int id ,Model model)
	{
		infoservice.displayByid(id);
		model.addAttribute("singleList", infoservice.displayByid(id));
		return "admin/info_update";
	}
	
	@RequestMapping(value="/admin/info_update/{id}" , method = RequestMethod.POST)
	public String saveInfoUpdate(@RequestParam("iid") int iid,@RequestParam("name") String name,@RequestParam("address") String address
			, @RequestParam("contactNumber") long contactNumber ,@RequestParam("email")
			String email,@RequestParam("description") String description,@RequestParam("photo") MultipartFile photo)
	{
		InfoModel infoModel = new InfoModel(iid,name,address,contactNumber,email,description,photo.getOriginalFilename());
		infoservice.edit(infoModel);
		fuService.uploadImage(photo, "hospital");
		return "redirect:/admin/info_display";
	}
	
	

}
