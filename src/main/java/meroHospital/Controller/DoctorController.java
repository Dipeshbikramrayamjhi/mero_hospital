package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import meroHospital.Model.DoctorModel;
import meroHospital.Service.DepartmentService;
import meroHospital.Service.DoctorService;
import meroHospital.Service.FileUploadService;

@Controller
public class DoctorController {

	@Autowired
	DepartmentService departmentService;
	@Autowired
	DoctorService doctorService;
	@Autowired
	FileUploadService fuService ;
	
	@RequestMapping(value="admin/doctor_form" , method = RequestMethod.GET)
	public String openDoctorForm(Model model)
	{
		model.addAttribute("dptlist", departmentService.display());
		return "admin/doctor_form";
	}
	@RequestMapping(value="/admin/doctor_form" , method = RequestMethod.POST)
	public String saveDoctorInfo(@RequestParam("doctorName") String doctorName ,
			@RequestParam("doctorPhoto") MultipartFile doctorPhoto ,
			@RequestParam("graduation") String graduation , 
			@RequestParam("specialist") String specialist,
			@RequestParam("dpt_id") int dpt_id,
			@RequestParam("workExperience") String workExperience,  
			@RequestParam("awardInfo") String awardInfo
			)
	{
		DoctorModel doctorModel = new DoctorModel(doctorName,doctorPhoto.getOriginalFilename(),graduation,specialist,
				workExperience,awardInfo);
		 doctorModel.setDepartment(departmentService.displayByid(dpt_id));	
		doctorService.save(doctorModel);
		fuService.uploadImage(doctorPhoto, "doctor");
		return "redirect:/admin/doctor_form";
	}
	
	
	@RequestMapping(value="admin/doctor_display" , method = RequestMethod.GET)
	public String showDoctorInfo(Model model)
	{
		model.addAttribute("displaylist", doctorService.display());
		return "admin/doctor_display";
	}
	
	@RequestMapping(value="admin/doctor_delete/{id}" , method = RequestMethod.GET)
	public String deleteDoctorInfo(@PathVariable("id") int id)
	{
		doctorService.delete(id);
		return "redirect:/admin/doctor_display";
	}
	@RequestMapping(value="admin/doctor_update/{id}" , method = RequestMethod.GET)
	public String openDoctorForm( @PathVariable("id") int id , Model model )
	{
		doctorService.displayByid(id);
		model.addAttribute("singlelist" , doctorService.displayByid(id));
		model.addAttribute("dptlist" , departmentService.display());
		return "admin/doctor_update";
	}
	@RequestMapping(value="/admin/doctor_update/{id}" , method = RequestMethod.POST)
	public String updateDoctorInfo(@RequestParam("did") int did ,@RequestParam("doctorName") String doctorName ,
			@RequestParam("doctorPhoto") MultipartFile doctorPhoto ,
			@RequestParam("graduation") String graduation , 
			@RequestParam("specialist") String specialist,
			@RequestParam("dpt_id") String dpt_id,
			@RequestParam("workExperience") String workExperience,
			@RequestParam("awardInfo") String awardInfo
			)
	{
		DoctorModel doctorModel = new DoctorModel(did,doctorName,doctorPhoto.getOriginalFilename(),graduation,specialist,
				workExperience,awardInfo);
		doctorModel.setDepartment(departmentService.displayByid(did));
		doctorService.edit(doctorModel);
		fuService.uploadImage(doctorPhoto, "doctor");
		return "redirect:/admin/doctor_display";
	}
	
}
