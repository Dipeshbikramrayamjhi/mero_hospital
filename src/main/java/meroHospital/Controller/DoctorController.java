package meroHospital.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {

	@RequestMapping(value="admin/doctor_form" , method = RequestMethod.GET)
	public String openDoctorForm()
	{
		return "admin/doctor_form";
	}
	
	@RequestMapping(value="admin/doctor_display" , method = RequestMethod.GET)
	public String showDoctorInfo()
	{
		return "admin/doctor_display";
	}
}
