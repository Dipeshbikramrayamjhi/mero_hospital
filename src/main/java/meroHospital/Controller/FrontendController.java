package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import meroHospital.Model.DoctorModel;
import meroHospital.Service.DepartmentService;
import meroHospital.Service.DoctorService;
import meroHospital.Service.InfoService;
import meroHospital.Service.LabReportService;

@Controller
public class FrontendController {
	
	@Autowired
	InfoService infoService ;
	@Autowired
	DepartmentService departmentService ;
	@Autowired
	DoctorService doctorService ;
	@Autowired
	LabReportService labReportService ;

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String openDash(Model model)
	{
		model.addAttribute("displayInfo", infoService.display());
		return "";
	}
	@RequestMapping(value = "/intro" , method = RequestMethod.GET)
	public String openIntro(Model model)
	{
		
		model.addAttribute("displayInfo", infoService.display() );
		return "intro";
	}
	
	@RequestMapping(value = "/department" , method = RequestMethod.GET)
	public String openDepartment(Model model)
	{
		model.addAttribute("displayInfo", infoService.display());
		model.addAttribute("displayDpt", departmentService.display());
		return "department";
	}
	@RequestMapping(value = "/lapReport" , method = RequestMethod.GET)
	public String openService(Model model)
	{
		model.addAttribute("displayReport", labReportService.display());
		model.addAttribute("displayInfo", infoService.display());
		return "service";
	}
	@RequestMapping(value = "/doctors" , method = RequestMethod.GET)
	public String openDoctors(Model model)
	{
		model.addAttribute("displayDoctor", doctorService.display());
		model.addAttribute("displayInfo", infoService.display());
		return "doctors"; 
	}
	@RequestMapping(value = "/doctors/{showid}" , method = RequestMethod.GET)
	public String showInfoDoctors(Model model,@PathVariable ("showid") int id)
	{
		
		
		model.addAttribute("viewDrInfo", doctorService.displayByid(id));
		//System.out.println(doctorService.displayByid(id));
		return "doctors";
	}
	@RequestMapping(value = "/gallery" , method = RequestMethod.GET)
	public String openGallery(Model model)
	{
		model.addAttribute("displayInfo", infoService.display());
		return "gallery";
	}
	@RequestMapping(value = "/appointment" , method = RequestMethod.GET)
	public String openAppointment(Model model)
	{
		model.addAttribute("displayInfo", infoService.display());
		return "appointment";
	}
	@RequestMapping(value = "/about" , method = RequestMethod.GET)
	public String openAbout(Model model)
	{
		model.addAttribute("displayInfo", infoService.display());
		return "about";
	}
	
}
