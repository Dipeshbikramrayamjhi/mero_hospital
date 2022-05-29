package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import meroHospital.Model.EquireModel;
import meroHospital.Service.EquireService;

@Controller
public class EnqiureController {
@Autowired
EquireService equireService ;
	@RequestMapping(value = "/admin/enqiure_display", method = RequestMethod.GET)
	public String openEnqiure(Model model)
	{
		model.addAttribute("display", equireService.display());
		return "admin/enqiure_display";
	}
	@RequestMapping(value = "/intro" , method = RequestMethod.POST)
	public String openIntro(@RequestParam("name") String name ,
			@RequestParam("email") String email ,
			@RequestParam("subject") String subject ,
			@RequestParam("message") String message)
	{
		
		EquireModel equireModel = new EquireModel(name , email,subject,message);
		equireService.save(equireModel);
		return "intro";
	}
	@RequestMapping(value = "/admin/enqiure_delete/{id}", method = RequestMethod.GET)
	public String deleteEnqiure(@PathVariable("id") int id)
	{
		equireService.delete(id);
		
		return "redirect:/admin/enqiure_display";
	}
	
}
