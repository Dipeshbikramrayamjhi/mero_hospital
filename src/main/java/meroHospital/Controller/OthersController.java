package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import meroHospital.Model.OthersModel;
import meroHospital.Service.OthersService;

@Controller

public class OthersController {
	
	@Autowired
	OthersService othersService ;
	
	@RequestMapping(value = "admin/others_form" , method = RequestMethod.GET)
	public String openOthers(Model model)
	{
		
		model.addAttribute("display", othersService.display());
		return "admin/others_form";
	}
	@RequestMapping(value = "admin/others_form" , method = RequestMethod.POST)
	public String saveOthers(@RequestParam("othersName") String othersName ,
			@RequestParam("aboutCheckup") String aboutCheckup )
	{
		OthersModel othersmodel = new OthersModel(othersName,aboutCheckup);
		othersService.save(othersmodel);
		return "redirect:/admin/others_form";
	}
	@RequestMapping(value = "admin/others_delete/{id}" , method = RequestMethod.GET)
	public String deleteOthers(@PathVariable ("id")  int id)
	{
		othersService.delete(id);
		return "redirect:/admin/others_form";
	}
	@RequestMapping(value = "admin/others_update/{id}" , method = RequestMethod.GET)
	public String updateOthers(@PathVariable ("id")  int id , Model model)
	{
		model.addAttribute("singlelist", othersService.displayByid(id));
		return "admin/others_update";
	}
	@RequestMapping(value = "admin/others_update/{id}" , method = RequestMethod.POST)
	public String updateOthers(@RequestParam("oid") int oid ,@RequestParam("othersName") String othersName ,
			@RequestParam("aboutCheckup") String aboutCheckup )
	{
		OthersModel othersModel = new OthersModel(oid,othersName,aboutCheckup);
		othersService.edit(othersModel);
		return "redirect:/admin/others_form";
	}
}
