package meroHospital.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import meroHospital.Model.DoctorModel;
import meroHospital.Model.JsonResponse;
import meroHospital.Service.DepartmentService;
import meroHospital.Service.DoctorService;

@Controller
public class ScheduleController {

	@Autowired
	DoctorService doctorService;
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value = "/admin/schedule" , method = RequestMethod.GET)
	public String openSchedule(Model model)
	{
		model.addAttribute("displayDpt", departmentService.display());
		return "admin/schedule";
	}
	
	
	@RequestMapping(value = "/admin/schedule_display" , method = RequestMethod.GET)
	public String displaySchedule()
	{
		return "admin/schedule_display";
	}
	
	@RequestMapping(value = "/admin/ajax" , method = RequestMethod.GET)
	@ResponseBody
	public JsonResponse getDrid(@RequestParam("dptid") int dptid)
	{
		 List<DoctorModel> docList=doctorService.display();
		 for(DoctorModel doc: docList) {
			 System.out.println(doc.getDid());
		 }
		 JsonResponse json = new JsonResponse();
		 json.setResult(docList);
	    return json;
	}
	
	
}
