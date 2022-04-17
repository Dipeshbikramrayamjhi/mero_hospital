package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import meroHospital.Model.OthersModel;
import meroHospital.Service.OthersService;

@Controller

public class OthersController {
	
	@Autowired
	OthersService othersservice ;
	
	@RequestMapping(value = "admin/others_form" , method = RequestMethod.GET)
	public String openOthers(Model model)
	{
		
		model.addAttribute("display", othersservice.display());
		return "admin/others_form";
	}
	@RequestMapping(value = "admin/others_form" , method = RequestMethod.POST)
	public String saveOthers(@RequestParam("othersName") String othersName ,
			@RequestParam("aboutCheckup") String aboutCheckup )
	{
		OthersModel othersmodel = new OthersModel(othersName,aboutCheckup);
		othersservice.save(othersmodel);
		return "redirect:/admin/others_form";
	}

}
